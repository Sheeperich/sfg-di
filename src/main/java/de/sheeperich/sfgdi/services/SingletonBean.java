package de.sheeperich.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author Sheeperich
 */
@Component
public class SingletonBean {


    public SingletonBean() {
        System.out.println("Creating a Singleton Bean!!!!");
    }

    public String getMyScope(){
        return "I'm Singleton";
    }
}
