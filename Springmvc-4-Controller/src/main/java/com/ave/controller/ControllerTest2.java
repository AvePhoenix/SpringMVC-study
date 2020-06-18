package com.ave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*代表这个类会被spring托管,这个类中的类中的方法返回类型是string
* 并且有具体的页面可以跳转，那么就会被视图解析器解析
* */
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg","流程为");
        return "test";
    }
}
