package com.store.bookez.common;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;

/**
 * Created by deretayl1 on 5/9/2016.
 */
public class LoginHelper {
    public static void displayUserName(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        if (name.equals("anonymousUser")) {
            model.addAttribute("userName", "Log-In");
        } else {
            model.addAttribute("userName", auth.getName());
        }
    }

    public static String getUserName(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userName = auth.getName(); //get logged in username
        return userName;
    }
}
