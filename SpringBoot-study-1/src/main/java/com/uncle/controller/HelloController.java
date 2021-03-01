package com.uncle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: SpringBoot-study
 * @description: Hello word的控制类
 * @author: 步尔斯特
 * @create: 2021-03-01 14:22
 **/
@Controller

public class HelloController {

    /**
    * @Description: hello请求
    * @Param: []
    * @return: java.lang.String
    * @Author: 步尔斯特
    * @Date: 2021/3/1
    */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello my son";
    }
}
