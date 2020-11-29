package Spring_AOP.AOP;

import org.springframework.stereotype.Component;

@Component("libBean")
public class Library {
    public void getBook() {
        System.out.println("Мы берём книгу.");
    }
}
