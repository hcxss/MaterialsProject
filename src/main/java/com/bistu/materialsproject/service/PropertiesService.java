package com.bistu.materialsproject.service;

import com.bistu.materialsproject.bean.Propertie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PropertiesService {

    Propertie findByMp_id(Integer mp_id);
    List<Propertie> getProperties(int pageNum, int pageSize);
    long getTableCount(String tableName);
}
