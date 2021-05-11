package com.nikita.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CheckEmailValidator implements ConstraintValidator<CheckerEmail, String> {

    private String endOfEmail;

    @Override
    public void initialize(CheckerEmail checkerEmail) {
        endOfEmail = checkerEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail);
    }
}
