package de.sheeperich.sfgdi.services;


import de.sheeperich.sfgdi.repositories.EnglishGreetingRepository;

public class i18nEnglishGreetingService implements GreetingService {

    public i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    private final EnglishGreetingRepository englishGreetingRepository;

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.sayGreeting();
    }
}
