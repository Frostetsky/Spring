package Spring_IoC.ConfigurationContainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:app.properties")
public class Employee {

    @Bean
    @Scope("singleton")
    public Developer getDeveloper() {
        return new Developer();
    }

    @Bean
    @Scope("singleton")
    public HR getHR() {
        return new HR();
    }
}
