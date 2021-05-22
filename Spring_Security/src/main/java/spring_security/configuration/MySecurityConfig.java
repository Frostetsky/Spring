package spring_security.configuration;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserBuilder builder = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(builder.username("Nikita")
                                 .password("220499")
                                 .roles("Employee"))
                .withUser(builder.username("Vlad")
                                 .password("123")
                                 .roles("HR"))
                .withUser(builder.username("Andrey")
                                 .password("321")
                                 .roles("Manager", "HR"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("Employee", "HR", "Manager")
                .antMatchers("/hr_info").hasRole("HR")
                .antMatchers("/manager_info").hasRole("Manager")
                .and()
                .formLogin()
                .permitAll();
    }
}
