package edu.kea.dependencyinjection.setterbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {


    private CarService c;

    @Autowired
    public void setC(CarService c) {
        this.c = c;
    }

    @GetMapping("/ligemeget")
    public String getCars() {
        return c.getCar();
    }



}
