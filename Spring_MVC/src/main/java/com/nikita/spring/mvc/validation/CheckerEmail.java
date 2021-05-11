package com.nikita.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckerEmail {
    String value() default "***.com";

    String message() default "Message from Employee";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
