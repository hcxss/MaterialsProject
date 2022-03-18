package com.bistu.materialsproject.controller;


import com.bistu.materialsproject.bean.common.Result;
import com.bistu.materialsproject.service.impl.DosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;

@Controller
@RequestMapping("/main")
public class DosController {
    @Autowired
    DosServiceImpl dosServiceImpl;
    @ResponseBody
    @RequestMapping(value = "/get_dosBympId",method = RequestMethod.POST)
    public Result get_dosBympId(HttpServletResponse response, HttpServletRequest request) throws ParseException{
        int mp_id= ServletRequestUtils.getIntParameter(request,"mp_id",0);
        Result res= new Result(dosServiceImpl.findByMp_id(mp_id));
        return res;
    }

    @ResponseBody
    @RequestMapping(value = "/get_dos",method = RequestMethod.POST)
    public Result getDos(HttpServletResponse response, HttpServletRequest request) throws ParseException {
        int pageNum= ServletRequestUtils.getIntParameter(request,"pageNum",0);
        int pageSize= ServletRequestUtils.getIntParameter(request,"pageSize",0);
        Result res= new Result(dosServiceImpl.getDos(pageNum, pageSize));
        return res;
    }



}
