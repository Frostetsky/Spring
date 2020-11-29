package Spring_IoC.ScopeAnnotation;

import Spring_IoC.IoC.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext3.xml");

        Dog dog1 = context.getBean("dogBean", Dog.class);
    }
}
