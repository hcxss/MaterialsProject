package com.bistu.materialsproject.service;

import com.bistu.materialsproject.bean.Composition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MainService {

    Composition findByMp_id(Integer mp_id);
    List<Composition> getComposition(int pageNum, int pageSize);


}
