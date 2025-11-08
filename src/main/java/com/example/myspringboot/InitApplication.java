package com.example.myspringboot;

import java.util.ArrayList;
import java.util.List;

import com.example.myspringboot.model.Car;
import com.example.myspringboot.model.Modification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitApplication implements CommandLineRunner {

    /**
     * Local data storage
     */
    public static List<Car> myGarage = new ArrayList<>();
    public static String[] germanCar = new String[] { "BMW", "VW", "MERCEDES" };

    public static void main(String[] args) {
        SpringApplication.run(InitApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Car bmw= new Car();
        bmw.setBrand("BMW");
        bmw.setModel("M3");
        bmw.setYear(2020);
        bmw.setEngine(3.0F);

        Modification bmwMod = new Modification();
        bmwMod.setStage("2");
        bmwMod.setTurbo(true);
        bmwMod.setNitro(true);

        bmw.setModifications(bmwMod);
        myGarage.add(bmw);

        Car golf= new Car();
        golf.setBrand("VW");
        golf.setModel("Golf R");
        golf.setYear(2019);
        golf.setEngine(2.0F);

        Modification golfMod = new Modification();
        golfMod.setStage("1");
        golfMod.setTurbo(true);
        golfMod.setNitro(false);

        golf.setModifications(golfMod);
        myGarage.add(golf);
    }
}