package edu.kea.dependencyinjection.fieldbased;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ElectricCar {

    public String brand() {
        return "Mercedes";
    }
}
