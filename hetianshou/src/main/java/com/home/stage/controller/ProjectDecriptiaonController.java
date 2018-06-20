package com.home.stage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/2 0002.
 */
public class ProjectDecriptiaonController {
    public String index(HttpServletRequest httpservletrequest, HttpServletResponse httpServletResponse){
        return "views/stage/index";
    }
}

