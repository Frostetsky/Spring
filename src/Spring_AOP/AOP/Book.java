package Spring_AOP.AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Му-му")
    private String name;

    public String getName() {
        return name;
    }
}
