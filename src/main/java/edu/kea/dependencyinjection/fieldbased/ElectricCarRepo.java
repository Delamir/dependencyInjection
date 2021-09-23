package edu.kea.dependencyinjection.fieldbased;

import org.springframework.stereotype.Repository;

@Repository
public class ElectricCarRepo {

    public String brand() {
        return "Mercedes";
    }
}
