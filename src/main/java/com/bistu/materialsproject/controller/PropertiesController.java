package com.bistu.materialsproject.controller;

import com.bistu.materialsproject.bean.common.Result;
import com.bistu.materialsproject.service.impl.PropertiesServiceImpl;
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
public class PropertiesController {
    @Autowired
    PropertiesServiceImpl propertiesServiceImpl;
    @ResponseBody
    @RequestMapping(value = "/get_propertiesBympId",method = RequestMethod.POST)
    public Result getPropertiesBympId(HttpServletResponse response, HttpServletRequest request) throws ParseException {
        int mp_id= ServletRequestUtils.getIntParameter(request,"mp_id",0);
        Result res= new Result(propertiesServiceImpl.findByMp_id(mp_id));
        return res;
    }

    @ResponseBody
    @RequestMapping(value = "/get_properties", method = RequestMethod.POST)
    public Result getProperties(HttpServletResponse response, HttpServletRequest request) throws ParseException {
        int pageNum= ServletRequestUtils.getIntParameter(request,"pageNum",0);
        int pageSize= ServletRequestUtils.getIntParameter(request,"pageSize",0);
        Result res= new Result(propertiesServiceImpl.getProperties(pageNum, pageSize));
        return res;
    }

    @ResponseBody
    @RequestMapping(value = "/get_tab_count", method = RequestMethod.POST)
    public Result getTabCount(HttpServletResponse response, HttpServletRequest request) throws ParseException {
        String  tableName= ServletRequestUtils.getStringParameter(request,"tableName","");

        Result res= new Result(propertiesServiceImpl.getTableCount(tableName));
        return res;
    }
}
