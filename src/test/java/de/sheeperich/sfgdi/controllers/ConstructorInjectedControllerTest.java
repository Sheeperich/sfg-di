package de.sheeperich.sfgdi.controllers;

import de.sheeperich.sfgdi.services.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingService() {
            @Override
            public String sayGreeting() {
                return null;
            }
        });
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}