package de.sheeperich.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class i18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello WOrld - Spanisgh";
    }
}
