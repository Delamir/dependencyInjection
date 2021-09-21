package edu.kea.dependencyinjection.setterbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motorcykel {


    String type;
    boolean turbo;
    String brand;


    public Motorcykel() {
    }

    @Autowired
    public void setType(String type) {
        this.type = type;
    }

    @Autowired
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Autowired
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void print() {
        System.out.println(type + turbo + brand);
    }
}