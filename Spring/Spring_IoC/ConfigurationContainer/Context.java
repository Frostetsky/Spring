package Spring_IoC.ConfigurationContainer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Context {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Employee.class);

        Developer developer = context.getBean("getDeveloper", Developer.class);
        HR hr = context.getBean("getHR", HR.class);
        developer.writeCode();
        System.out.println(developer.getAge());
        System.out.println(developer.getName());
        hr.call();
    }
}
