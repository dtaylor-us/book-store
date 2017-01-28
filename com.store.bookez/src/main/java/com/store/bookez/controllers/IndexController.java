package com.store.bookez.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by deretayl1 on 5/3/2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        String name = displayUserName(model);
        if (name.equals("admin"))
            return "admin/adminHome";
        else
            return "index";
    }

    @RequestMapping(value = "/login")
    public String login(Model model) {
        displayUserName(model);
        return "login";
    }

    public String displayUserName(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        {
            String name = auth.getName(); //get logged in username
            model.addAttribute("userName", auth.getName());
            return name;
        }


    }


}
