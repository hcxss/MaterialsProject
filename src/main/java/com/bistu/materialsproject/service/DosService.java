package com.bistu.materialsproject.service;



import com.bistu.materialsproject.bean.Dos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DosService {
    Dos findByMp_id(Integer mp_id);
    List<Dos> getDos(int pageNum, int pageSize);
    long getTableCount(String tableName);
}
