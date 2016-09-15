package com.mbti.controllers;

import com.mbti.domain.Mbti;
import com.mbti.services.MbtiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ari on 9/12/16.
 */
@Controller
public class MbtiTestController {
    private MbtiService mbtiService;
    private Mbti mbti;

    @Autowired
    public void setMbtiService(MbtiService mbtiService) {
        this.mbtiService = mbtiService;
    }

    @RequestMapping(value = "/mbti/test/questions", method = RequestMethod.GET)
    public String list(Model model) {

        model.addAttribute("mbti", mbtiService.listAllMbti());
//        ActionListener
//        RabbitProperties.Listener.
//
//        Attributekey.propertyName
            return "mbti/test/questions";
        }

    @RequestMapping(value="/mbti/test/getResults", method = RequestMethod.POST)
    public  String list2(Model model){
//        model.addAttribute("results", resultsService.listAllResults());
        return "mbti/test/getResults";
    }

}

