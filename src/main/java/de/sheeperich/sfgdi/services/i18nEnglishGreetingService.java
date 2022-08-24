package de.sheeperich.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
@Primary
public class i18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Welt - Englisch";
    }
}
