package Spring_AOP.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        RussianLibrary saratovLib = context.getBean("saratovLibBean", RussianLibrary.class);
        Book book = context.getBean("bookBean", Book.class);

        saratovLib.getBook(book);
        saratovLib.returnBook("Преступление и наказание");
        saratovLib.getMagazine();

        //RussianLibrary moscowLib = context.getBean("moscowLibBean", RussianLibrary.class);
        //moscowLib.getBook();

        context.close();
    }
}
