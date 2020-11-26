package Spring_DI.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //Pet pet = new Cat();
        //Person person = new Person(pet);
        //person.callYourPet();

        // Hard зависимость.
        //Pet pet = context.getBean("myPet", Pet.class);
        //Person person = new Person(pet);
        //person.callYourPet();

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getName());
        context.close();
    }
}
