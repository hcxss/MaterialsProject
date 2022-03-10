package com.bistu.materialsproject.controller;

import com.bistu.materialsproject.bean.common.Result;
import com.bistu.materialsproject.service.MainService;
import com.bistu.materialsproject.service.impl.MainServiceImpl;
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
public class MainController {
    @Autowired
    MainServiceImpl mainServiceImpl;
    @ResponseBody
    @RequestMapping(value = "/get_compositionBympId", method = RequestMethod.POST)
    public Result getCompositionBympId(HttpServletResponse response, HttpServletRequest request) throws ParseException {
        int mp_id= ServletRequestUtils.getIntParameter(request,"mp_id",0);
        Result res= new Result(mainServiceImpl.findByMp_id(mp_id));
        return res;
    }
    @ResponseBody
    @RequestMapping(value = "/get_composition", method = RequestMethod.POST)
    public Result getComposition(HttpServletResponse response, HttpServletRequest request) throws ParseException {
        int pageNum= ServletRequestUtils.getIntParameter(request,"pageNum",0);
        int pageSize= ServletRequestUtils.getIntParameter(request,"pageSize",0);
        Result res= new Result(mainServiceImpl.getComposition(pageNum, pageSize));
        return res;
    }
}
