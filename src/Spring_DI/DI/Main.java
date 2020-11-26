package Spring_DI.DI;

import Spring_IoC.IoC.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Pet pet = new Cat();
        //Person person = new Person(pet);
        //person.callYourPet();

        // Hard зависимость.
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Pet pet = context.getBean("MyPet", Pet.class);
        Person person = new Person(pet);
        person.callYourPet();

        context.close();
    }
}
