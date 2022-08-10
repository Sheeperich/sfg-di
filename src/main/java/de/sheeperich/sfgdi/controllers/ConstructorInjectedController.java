package de.sheeperich.sfgdi.controllers;

import de.sheeperich.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController ( GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
