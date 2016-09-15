package com.mbti.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by Ari on 9/2/16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index(Model model){

    model.addAttribute("datetime", new Date());

        return "index";
    }

}