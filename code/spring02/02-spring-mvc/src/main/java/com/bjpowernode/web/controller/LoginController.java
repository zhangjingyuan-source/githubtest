package com.bjpowernode.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author:张京远
 * 2019/11/7
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login.do")
    public String Login(){
        return "index";
    }
}
