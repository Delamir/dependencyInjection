package edu.kea.dependencyinjection.fieldbased;

import org.springframework.stereotype.Repository;

@Repository
public class ElectricCarRepo {

    //Dataen i repo
    public String brand() {
        return "Mercedes";
    }
}
