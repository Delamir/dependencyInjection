package edu.kea.dependencyinjection.setterbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    String superCar;

    public String getCar() {
        return superCar;
    }

    @Autowired
    public void SetCar(String superCar){
        this.superCar = superCar;
    }



}
