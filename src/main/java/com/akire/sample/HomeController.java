package com.akire.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = GET)
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("todayDate", LocalDateTime.now());
        return modelAndView;
    }
}

