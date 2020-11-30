package Spring_AOP.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //@Before("execution(public void getBook())")
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
    }

    @Before("execution(public void returnBook(String))")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу.");
    }

    @Before("execution(public void getBook(Spring_AOP.AOP.Book))")
    public void beforeGetBookWithParamBookAdvice() {
        System.out.println("beforeGetBookWithParamBookAdvice: Попытка получить книгу с нужным именем.");
    }
}
