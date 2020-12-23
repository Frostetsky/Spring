package Spring_DI.AnnotationAutowired;

import Spring_DI.DI.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowired {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();
    }
}
