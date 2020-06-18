package com.ave.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//只要实现Controller接口的类就能实现控制器的功能，说明这是一个控制器
public class ControllerTest1 implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","sikjfgkjsdgfjkhgedfih");
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
