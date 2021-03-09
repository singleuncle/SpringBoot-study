package com.uncle.controller;

import com.uncle.bean.Guest;
import com.uncle.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @PostMapping
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name) {
        Guest guest = guestService.getName(name);
        System.out.println(guest);
        model.addAttribute("guest", guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("{name}")
    public String delete(@PathVariable("name") String name) {
        guestService.delete(name);
        return "redirect:/guest";
    }//b b c c d b 0.3102683
}
