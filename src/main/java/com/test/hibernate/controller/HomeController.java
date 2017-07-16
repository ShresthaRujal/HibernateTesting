package com.test.hibernate.controller;

import com.test.hibernate.dao.UserDao;
import com.test.hibernate.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ruzal on 7/14/2017.
 */
@Controller
public class HomeController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(ModelMap modelMap){
        modelMap.addAttribute("user",new User());
        return "home";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(@ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "home";
        }
        System.out.println(user.getName());
        System.out.println(user.getAddress());

        userDao.insert(user);
        return "success";

    }

}
