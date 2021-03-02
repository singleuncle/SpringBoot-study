package com.uncle.controller;

import com.uncle.bean.Food;
import com.uncle.bean.Vegetables;
import com.uncle.config.FoodConfig;
import com.uncle.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringBoot-study
 * @description: 'Json'的控制类
 * @author: 步尔斯特
 * @create: 2021-03-01 16:33
 **/
@RestController
public class JsonController {
//    //通过@Value和${food.rice}获得配置文件中的属性值
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;



    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/hello")
    public Food json() {
        Food food = new Food();
        food.setRice(foodConfig.getRice());
        food.setMeat(foodConfig.getMeat());
        food.setSauce(foodConfig.getSauce());
        return food;
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vegetables() {
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setApple(vegetablesConfig.getApple());
        return vegetables;
    }


    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/jsypt")
    public String jsypt() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(username);
        stringBuffer.append("\t");
        stringBuffer.append(password);
        return stringBuffer.toString();
    }
}
