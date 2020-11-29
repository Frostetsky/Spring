package Spring_IoC.ConfigWithAnnotation;

import Spring_IoC.IoC.Cat;
import Spring_IoC.IoC.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationComponent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext3.xml");
        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        Dog dog = context.getBean("dog", Dog.class);
        dog.say();
        context.close();
    }
}
