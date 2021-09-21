package edu.kea.dependencyinjection.constructorbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    String type;
    boolean turbo;
    String brand;

    @Autowired
    public Car (String type, boolean turbo, String brand) {
        this.type = type;
        this.turbo = turbo;
        this.brand = brand;

        System.out.println(type + turbo + brand);
    }

    public Car() {
        Car car = new Car();

    }
}
