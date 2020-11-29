package Spring_IoC.ConfigurationContainer;

import Spring_DI.DI.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Context {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
