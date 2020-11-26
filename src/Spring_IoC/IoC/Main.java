package Spring_IoC.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Pet pet = context.getBean("MyPet", Pet.class);
        pet.say();
        context.close();
    }
}
