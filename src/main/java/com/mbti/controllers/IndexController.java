package com.mbti.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ari on 9/2/16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index(){
        return "index";
    }

}