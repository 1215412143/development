package com.home.stage.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/2 0002.
 */
public class ProjectDecriptiaonController {
    public String index(HttpServletrequest httpservletrequest, HttpSevletResponse httpServletResponse){
        return "views/stage/index";
    }
}

