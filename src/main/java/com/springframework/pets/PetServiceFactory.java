package com.springframework.pets;

/**
 * @author Sheeperich
 */

public class PetServiceFactory {

    public PetService getPetservice(String petType){
        switch (petType){
            case "dog" :
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
