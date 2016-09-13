package com.mbti.controllers;

import com.mbti.services.MbtiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by Ari on 9/12/16.
 */
@Controller
public class MbtiTestController {
    private MbtiService mbtiService;
    int e;
    int i;
    int s;
    int n;
    int t;
    int f;
    int p;
    int j;


    @Autowired
    public void setMbtiService(MbtiService mbtiService) {
        this.mbtiService = mbtiService;
    }

    @RequestMapping(value = "/mbti/test/questions", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("datetime", new Date());
        model.addAttribute("mbti", mbtiService.listAllMbti());
//
//        mbtiService.getMbtiById(id);
//        {
//            if (id <= 5) {
//                model.addAttribute("e", e);
//                model.addAttribute("i", i);
//            }
//            if (id > 5 && id <= 10) {
//                model.addAttribute("s", s);
//                model.addAttribute("n", n);
//            }
//            if (id > 10 && id <= 15) {
//                model.addAttribute("t", t);
//                model.addAttribute("f", f);
//            }
//            if (id > 15 && id <= 20) {
//                model.addAttribute("p", p);
//                model.addAttribute("j", j);
//            }

            return "mbti/test/questions";
        }


//    @RequestMapping("mbti/{id}")
//    public String showMbti(@PathVariable Integer id, Model model){
//        model.addAttribute("mbti", mbtiService.getMbtiById(id));
//        return "getResults";
//    }


}

