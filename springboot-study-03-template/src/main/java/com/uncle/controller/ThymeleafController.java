package com.uncle.controller;

import com.uncle.bean.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @program: SpringBoot-study
 * @description: 学习thymeleaf的控制层
 * @author: 步尔斯特
 * @create: 2021-03-02 20:24
 **/
@Controller
public class ThymeleafController {

    @RequestMapping("/thyme")
    public String index(Model model) {

        Restaurant restaurant = new Restaurant();
        restaurant.setBoss("老板");
        restaurant.setChef("林大厨");
//        model.addAttribute("name", "Thymeleaf");
        model.addAttribute("restaurant", restaurant);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model) {

        model.addAttribute("now", new Date().toString());

        return "/thymeleaf/welcome";
    }
}
