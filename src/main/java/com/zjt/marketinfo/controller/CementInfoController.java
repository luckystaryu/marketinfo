package com.zjt.marketinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cement")
public class CementInfoController {
    @GetMapping (value = "/info")
    public String CementInfo(){
        return "hello word";
    }
}
