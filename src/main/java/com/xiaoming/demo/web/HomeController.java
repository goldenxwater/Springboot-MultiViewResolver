package com.xiaoming.demo.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private Logger logger = Logger.getLogger(getClass());

    @RequestMapping("/")
    public String index(ModelMap map) {
        return "index";
    }

    @RequestMapping("/toIndex1")
    public String toIndex1(){
        return "jsp/index";
    }

    @RequestMapping("/toIndex2")
    public String toIndex2(){
        return "index";
    }

}
