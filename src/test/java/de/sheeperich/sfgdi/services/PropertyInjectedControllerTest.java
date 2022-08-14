package de.sheeperich.sfgdi.services;

import de.sheeperich.sfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingService() {
            @Override
            public String sayGreeting() {
                return null;
            }
        };
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}