package Spring_AOP.AOP;

import org.springframework.stereotype.Component;

@Component("moscowLibBean")
public class MoscowLibrary extends RussianLibrary {

    @Override
    public void getBook(Book book) {
        System.out.println("Магазин Москвы | Мы берём книгу " + book.getName());
    }

    @Override
    public void returnBook(String name) {
        System.out.println("Возвращаем книгу.");
    }

    @Override
    public void getMagazine() {

    }


}
