package com.bistu.materialsproject.service.impl;


import com.bistu.materialsproject.bean.Structure;
import com.bistu.materialsproject.service.StructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StructureServiceImpl implements StructureService {
    @Autowired
    MongoTemplate mongoTemplate;
    @Override
    public Structure findByMp_id(Integer mp_id) {
        Query query = new Query(Criteria.where("mp_id").is(mp_id)).limit(1);
        return mongoTemplate.findOne(query, Structure.class);

    }
    /*
    * @pageNum 页码
    * @pageSize 页长
    * */
    @Override
    public List<Structure> getStructure(int pageNum, int pageSize) {
        Query query = new Query();
        // 通过 _id 来排序
        query.with(Sort.by(Sort.Direction.ASC, "mp_id"));

        if (pageNum != 1) {
            // number 参数是为了查上一页的最后一条数据
            int number = (pageNum - 1) * pageSize;
            query.limit(number);

            List<Structure> structure = mongoTemplate.find(query, Structure.class);
            // 取出最后一条
            Structure Structure= structure.get(structure.size() - 1);

            // 取到上一页的最后一条数据 id，当作条件查接下来的数据
            int id = Structure.getMp_id();

            // 从上一页最后一条开始查（大于不包括这一条）
            query.addCriteria(Criteria.where("mp_id").gt(id));
        }
        // 页大小重新赋值，覆盖 number 参数
        query.limit(pageSize);
        // 即可得到第n页数据
        List<Structure> StructureList = mongoTemplate.find(query, Structure.class);

        return StructureList;

    }
    @Override
    public long getTableCount(String tableName) {
        Query query = new Query();
        long count=mongoTemplate.getCollection(tableName).countDocuments();
        return count;
    }
}
