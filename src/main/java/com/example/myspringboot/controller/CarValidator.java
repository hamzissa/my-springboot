package com.example.myspringboot.controller;
import com.example.myspringboot.InitApplication;
import com.example.myspringboot.model.Car;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Arrays;

public class CarValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Car.class.equals(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        Car car = (Car) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "",
                "Your model needs a name!");

        if(car.getEngine() == null){
            errors.rejectValue("engine", "", "Invalid engine size.");


        }

        if(car.getEngine() != null) {
            if (car.getEngine() > 8.1 || car.getEngine() < 0.8) {
                errors.rejectValue("engine", "", "Invalid engine size.");
            }
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "year", "",
                "Your engine needs a number!");

        if (!Arrays.asList(InitApplication.germanCar).contains(car.getBrand())) {
            errors.rejectValue("brand", "", "Invalid brand.");
        }
        if(car.getYear()>2025 || car.getYear()<1950 ){
            errors.rejectValue("year", "", "Invalid year.");
        }



    }
}
