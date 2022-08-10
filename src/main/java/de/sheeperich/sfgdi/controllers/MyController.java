package de.sheeperich.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello WOrld!");

        return "Hi Folks";
    }
}
