package Spring_AOP.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Library lib = context.getBean("libBean", Library.class);
        lib.getBook();

        context.close();
    }
}
