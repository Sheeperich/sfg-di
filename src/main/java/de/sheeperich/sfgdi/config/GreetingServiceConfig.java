package de.sheeperich.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import de.sheeperich.sfgdi.repositories.EnglishGreetingRepository;
import de.sheeperich.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import de.sheeperich.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @author Sheeperich
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(){
        return petServiceFactory().getPetservice("dog");
    }

    @Profile({"cat"})
    @Bean
    PetService CaPetService(){
        return petServiceFactory().getPetservice("cat");
    }
    @Profile({"ES","default"})
    @Bean("i18nService")
    i18nSpanishGreetingService i18nSpanishGreetingService(){
        return new i18nSpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    i18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new i18nEnglishGreetingService(englishGreetingRepository);
    }

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();

    }


    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
