package com.bistu.materialsproject.service;


import com.bistu.materialsproject.bean.Structure;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StructureService {
    Structure findByMp_id(Integer mp_id);
    List<Structure> getStructure(int pageNum, int pageSize);
    long getTableCount(String tableName);
}
