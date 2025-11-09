package com.example.myspringboot.controller;

import com.example.myspringboot.InitApplication;
import com.example.myspringboot.model.Car;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarController {
    @GetMapping("/showcars")
    public String exercise(Model model) {
        model.addAttribute("cars", InitApplication.myGarage);
        Car car = new Car();
        car.setYear(2025);
        model.addAttribute("car", car);
        model.addAttribute("brandlist", InitApplication.germanCar);
        return "cars";
    }
    @PostMapping("/addcar")
    public String addCar(Model model,@Valid @ModelAttribute("car") Car car, BindingResult result) {

       model.addAttribute("cars", InitApplication.myGarage);
        model.addAttribute("car", car);
        model.addAttribute("brandlist", InitApplication.germanCar);



        if (result.hasErrors()) {
            return "/cars";
        }
        else{

            int id = InitApplication.myGarage.size() + 1;
            car.setId(id);
            InitApplication.myGarage.add(car);
        }
        return "redirect:/showcars";
    }

    @GetMapping("/editcar")
    public String editCar(@RequestParam int id, Model model) {
        System.out.println(id);

        Car car = InitApplication.myGarage.get(id-1);
        model.addAttribute("cars", InitApplication.myGarage);
        model.addAttribute("car", car);
        model.addAttribute("brandlist", InitApplication.germanCar);

//        Car car = InitApplication.myGarage.stream()
//                .filter(c -> c.getId() == id)
//                .findFirst()
//                .orElse(null);

        return "cars";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new CarValidator());
    }


}
