package Spring_DI.DI;

import Spring_IoC.IoC.Pet;

public class Person {
    private Pet pet;

    public Person() {

    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }
}
