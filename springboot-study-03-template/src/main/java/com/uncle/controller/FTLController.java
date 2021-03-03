package com.uncle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


/**
 * @program: SpringBoot-study
 * @description: 模版学习的控制层
 * @author: 步尔斯特
 * @create: 2021-03-02 19:24
 **/

/**
 * @Controller是视图层使用的注解
 * @RestController是返回Json格式的注解
 */
@Controller
//@RestController
public class FTLController {

    @RequestMapping("/ftl")
    public ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("now",new Date().toString());
        modelAndView.setViewName("/freemarker/index");

        return modelAndView;
    }

}
