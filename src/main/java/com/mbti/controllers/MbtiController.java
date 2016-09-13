package com.mbti.controllers;

import com.mbti.services.MbtiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ari on 9/6/16.
 */
@Controller
//shows path from root (template or index directory/to final containing folder/)
@RequestMapping(value = "/mbti/")
public class MbtiController {

    private MbtiService mbtiService;

    //shows file name not including postfix . is an extension of prior mapping and can contain folder dir first
    @RequestMapping("Guardian")
    //must be exact path (reflects html string path)
    String guardian(){
        return "mbti/Guardian";
    }
    @RequestMapping("guardians/ISTJ")
    String istj(){
        return "mbti/guardians/ISTJ";
    }
    @RequestMapping("guardians/ISFJ")
    String isfj(){
        return "mbti/guardians/ISFJ";
    }
    @RequestMapping("guardians/ESTJ")
    String estj(){
        return "mbti/guardians/ESTJ";
    }
    @RequestMapping("guardians/ESFJ")
    String esfj(){
        return "mbti/guardians/ESFJ";
    }

    @RequestMapping("Artisan")
    String artisan(){
        return "mbti/Artisan";
    }
    @RequestMapping("artisans/ISTP")
    String istp(){
        return "mbti/artisans/ISTP";
    }
    @RequestMapping("artisans/ISFP")
    String isfp(){
        return "mbti/artisans/ISFP";
    }
    @RequestMapping("artisans/ESTP")
    String estp(){
        return "mbti/artisans/ESTP";
    }
    @RequestMapping("artisans/ESFP")
    String esfp(){
        return "mbti/artisans/ESFP";
    }

    @RequestMapping("Idealist")
    String idealist(){
        return "mbti/Idealist";
    }
    @RequestMapping("idealists/ENFP")
    String enfp(){
        return "mbti/idealists/ENFP";
    }
    @RequestMapping("idealists/ENFJ")
    String enfj(){
        return "mbti/idealists/ENFJ";
    }
    @RequestMapping("idealists/INFP")
    String infp(){
        return "mbti/idealists/INFP";
    }
    @RequestMapping("idealists/INFJ")
    String infj(){
        return "mbti/idealists/INFJ";
    }
    @RequestMapping("idealists/index")
    String index(){
        return "mbti/idealists/index";
    }

    @RequestMapping("Rationalist")
    String rationalist(){
        return "mbti/Rationalist";
    }
    @RequestMapping("rationalists/ENTP")
    String entp(){
        return "mbti/rationalists/ENTP";
    }
    @RequestMapping("rationalists/ENTJ")
    String entj(){
        return "mbti/rationalists/ENTJ";
    }
    @RequestMapping("rationalists/INTP")
    String intp(){
        return "mbti/rationalists/INTP";
    }
    @RequestMapping("rationalists/INTJ")
    String intj(){
        return "mbti/rationalists/INTJ";
    }





}
