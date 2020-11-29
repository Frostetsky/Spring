package Spring_IoC.ConfigurationContainer;

import org.springframework.beans.factory.annotation.Value;

public class Developer {
    @Value("${developer.name}")
    private String name;
    @Value("${developer.age}")
    private int age;

    public Developer() {
    }

    public void writeCode() {
        System.out.println("Write Java Code...");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
