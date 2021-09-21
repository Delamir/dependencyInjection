package edu.kea.dependencyinjection.fieldbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    String type;
    @Autowired
    boolean turbo;
    @Autowired
    String brand;

    public Car (String type, boolean turbo, String brand) {
        this.type = type;
        this.turbo = turbo;
        this.brand = brand;

        System.out.println(type + turbo + brand);
    }

    public Car() {
        edu.kea.dependencyinjection.fieldbased.Car car = new edu.kea.dependencyinjection.fieldbased.Car();

    }
}
