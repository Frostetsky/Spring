package Spring_DI.BeanScope;

import Spring_IoC.IoC.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog otherDog = context.getBean("myPet", Dog.class);
        otherDog.setName("Strelka");

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == otherDog));
        System.out.println(myDog.getName());
        System.out.println(otherDog.getName());
        context.close();
    }
}
