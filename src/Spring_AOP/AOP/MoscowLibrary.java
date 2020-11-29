package Spring_AOP.AOP;

import org.springframework.stereotype.Component;

@Component("moscowLibBean")
public class MoscowLibrary extends RussianLibrary {

    @Override
    public void getBook() {
        System.out.println("Магазин Москвы | Мы берём книгу.");
    }

    @Override
    public void returnBook() {

    }

    @Override
    public void getMagazine() {

    }
}
