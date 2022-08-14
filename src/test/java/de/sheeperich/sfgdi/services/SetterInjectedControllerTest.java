package de.sheeperich.sfgdi.services;

import de.sheeperich.sfgdi.controllers.SetterInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingService() {
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