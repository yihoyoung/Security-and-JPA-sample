package com.example.web;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hoyounglee on 2016. 8. 13..
 */
@Controller
public class MainController {
    @RequestMapping(value={"/"}, method = RequestMethod.GET)
    public ModelAndView welcomePage(Authentication auth){
        ModelAndView view = new ModelAndView();
        if (auth != null && auth.getName() != null)
            view.addObject("message", "welcome " + auth.getName() + " user.");
        else
            view.addObject("message", "welcome anonymous user.");
        view.setViewName("home");
        return view;
    }
}

