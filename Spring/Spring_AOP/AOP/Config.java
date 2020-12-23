package Spring_AOP.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Spring_AOP.AOP")
@EnableAspectJAutoProxy
public class Config {
}
