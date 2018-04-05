package com.developer.SpringMySQL.controller;

import com.developer.SpringMySQL.models.AppOutputRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by @author OGI aka nOy39
 *
 * @Date 05.04.2018
 * @Time 10:18
 */
@Controller
public class MainController {

    @Autowired
    private AppOutputRepo appRepo;

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists",appRepo.findAll());
        return mv;
    }
}
