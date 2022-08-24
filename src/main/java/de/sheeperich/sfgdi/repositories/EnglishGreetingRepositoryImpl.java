package de.sheeperich.sfgdi.repositories;

/**
 * @author Sheeperich
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String sayGreeting() {
        return "Hello Welt - Englisch//EN";
    }
}
