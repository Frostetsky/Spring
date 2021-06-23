package Spring_DI.job4j;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("Spring_DI.job4j");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        System.out.println();
        StartUI other = context.getBean(StartUI.class);
        other.add("Nikita Nesterenko");
        other.print();
    }
}

/*
1. singleton - объект создает один раз на всю виртуальную машину.

2. prototype - каждый раз создается новый объект.

3. session - объект существует, пока существует сессия пользователя.

4. request - объект существует, пока существует запрос.

5. application - объект существует, пока существует ServletContext.

6. websocket - объект существует, пока есть активная сессия для web-сокета.
 */
