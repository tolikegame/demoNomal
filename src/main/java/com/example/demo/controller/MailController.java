package com.example.demo.controller;

import com.example.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping(value = "mail")
    public String mail(){
        mailService.sendMail(
                "tgfc045@tgfc.tw",
                "安安你好",
                "你好安安"
        );
        return "發送成功";
    }
}
