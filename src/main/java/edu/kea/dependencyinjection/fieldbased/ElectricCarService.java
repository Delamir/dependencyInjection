package edu.kea.dependencyinjection.fieldbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ElectricCarService {

    @Autowired
    private ElectricCar electricCar;

    public void setElectricCar(ElectricCar electricCar) {
        System.out.println("ElectricCar setter called");
        this.electricCar = electricCar;
    }

    public ElectricCarService() {
        System.out.println("ElectricCarService no argument constructor called");
    }

    public ElectricCarService(ElectricCar electricCar) {
        System.out.println("ElectricCarService argument constructor called");
        this.electricCar = electricCar;
    }


}
