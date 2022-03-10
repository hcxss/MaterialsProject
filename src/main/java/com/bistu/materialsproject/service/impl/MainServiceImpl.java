package com.bistu.materialsproject.service.impl;

import com.bistu.materialsproject.bean.Composition;
import com.bistu.materialsproject.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    MongoTemplate mongoTemplate;
    @Override
    public Composition findByMp_id(Integer mp_id) {
        Query query = new Query(Criteria.where("mp_id").is(mp_id)).limit(1);
        return mongoTemplate.findOne(query, Composition.class);

    }

    @Override
    public List<Composition> getComposition(int pageNum, int pageSize) {
        Query query = new Query();
        // 通过 _id 来排序
        query.with(Sort.by(Sort.Direction.ASC, "mp_id"));

        if (pageNum != 1) {
            // number 参数是为了查上一页的最后一条数据
            int number = (pageNum - 1) * pageSize;
            query.limit(number);

            List<Composition> Compositions = mongoTemplate.find(query, Composition.class);
            // 取出最后一条
            Composition Composition = Compositions.get(Compositions.size() - 1);

            // 取到上一页的最后一条数据 id，当作条件查接下来的数据
            int id = Composition.getMp_id();

            // 从上一页最后一条开始查（大于不包括这一条）
            query.addCriteria(Criteria.where("mp_id").gt(id));
        }
        // 页大小重新赋值，覆盖 number 参数
        query.limit(pageSize);
        // 即可得到第n页数据
        List<Composition> CompositionList = mongoTemplate.find(query, Composition.class);

        return CompositionList;

    }
}
