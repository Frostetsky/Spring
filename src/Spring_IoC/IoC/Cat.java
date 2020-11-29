package Spring_IoC.IoC;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {

    public Cat() {

    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
