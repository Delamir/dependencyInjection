package edu.kea.dependencyinjection.setterbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {


    private CarService carService;

    @GetMapping("/ligemeget")
    public String getCars() {
        return carService.getCar();
    }

    @Autowired
    public void setC(CarService carService) {
        this.carService = carService;
    }



}
