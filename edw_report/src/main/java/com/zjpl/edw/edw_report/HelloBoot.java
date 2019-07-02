package com.zjpl.edw.edw_report;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloBoot {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello Word Spring Boot ....";
    }

    @RequestMapping(value="/first",method = RequestMethod.GET)
    public ModelAndView firstDemo(){
        return new ModelAndView("test");
    }
    @RequestMapping(value="/course_clickcount",method = RequestMethod.GET)
    public ModelAndView course_clickcount(){
        return new ModelAndView("demo");
    }
}
