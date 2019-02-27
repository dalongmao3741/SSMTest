package com.dalongmao.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login(@RequestParam String user, @RequestParam String password) {
        //System.out.println(user);
       // System.out.println(password);
        if (user.equals("admin") && password.equals("123456")) {
            return "redirect:/getAll";
        }

        return "redirect:/to_login";
    }
    @RequestMapping(value = "to_login")
    public ModelAndView to_login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

}

