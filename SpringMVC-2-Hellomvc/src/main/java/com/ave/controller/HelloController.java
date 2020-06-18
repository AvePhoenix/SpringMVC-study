package com.ave.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//注意：这里我们先导入Controller接口
public class HelloController implements Controller {//继承了Controller就可以处理请求和响应

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        /*ModelAndView是一个对象，Model用来存数据 View用来设定要转发的对象*/
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        //封装对象，放在ModelAndView中。Model
        mv.addObject("msg","HelloSpringMVC!");
        /*设置一个msg对象，将HelloSpringMVC赋值给它*/

        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("hello"); //: /WEB-INF/jsp/hello.jsp
        /*将对象发送到hello这个页面进行渲染*/
        /*
        在springmvc-servlet.xml中我们配置了
                <!--前缀-->
                <property name="prefix" value="/WEB-INF/jsp/"/>
                <!--后缀-->
                <property name="suffix" value=".jsp"/>
        所以只需要填写页面名称就能自动将转发页面确定位为/WEB-INF/jsp/hello.jsp
         */
        return mv;
    }

}