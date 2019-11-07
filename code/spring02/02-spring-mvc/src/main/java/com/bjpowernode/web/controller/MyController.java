package com.bjpowernode.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author:张京远
 * 2019/11/7
 */
@Controller
public class MyController {

    @RequestMapping(value="/student/save.do",method= RequestMethod.GET)
    public ModelAndView doSome(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("result");
        System.out.println(1456);
        return mv;
    }

    @RequestMapping(value="/student/turnTo.do")
    public String turnTo(){
        return "result2";
    }
}
