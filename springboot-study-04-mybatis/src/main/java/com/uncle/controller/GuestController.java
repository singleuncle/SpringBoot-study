package com.uncle.controller;

import com.uncle.bean.Guest;
import com.uncle.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: SpringBoot-study
 * @description: 嘉宾的控制层
 * @author: 步尔斯特
 * @create: 2021-03-03 14:22
 **/
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String list(Model model) {
        List<Guest> list = guestService.list();
        model.addAttribute("list", list);
        return "list";
    }

}
