package com.DariusO.Songr2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
    @RequestMapping("/hello")
    public class HelloController {
        @RequestMapping(value = "/" , method = RequestMethod.GET)
        @ResponseBody
        public String getTest(){
            return "splashPage";
        }
        @GetMapping("/hi")
        public String getHi(){
            return "hello";
        }
        @GetMapping("/capitalize/{words}")
        public String getCapitalize(@PathVariable String words, Model m){
            m.addAttribute("words", setCapitalize(words));
            return "capitalize";
        }

        public static  String setCapitalize(String words){
            return words.toUpperCase();
        }






    }

