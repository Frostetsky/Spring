package Spring_AOP.AOP;

import org.springframework.stereotype.Component;

@Component("saratovLibBean")
public class SaratovLibrary extends RussianLibrary {
    @Override
    public void getBook() {
        System.out.println("Магазин Саратова | Мы берём книгу.");
    }

    public void returnBook() {
        System.out.println("Магазин Саратова | Мы возвращаем книгу.");
    }

    public void getMagazine() {
        System.out.println("Магазин Саратова | Мы берём журнал.");
    }
}
