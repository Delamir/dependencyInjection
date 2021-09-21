package edu.kea.dependencyinjection.fieldbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/electricCars")
public class ElectricCarController {

    @Autowired
    private ElectricCarService electricCarService;

    public void setService(ElectricCarService service) {
        System.out.println("ElectricCarController stter called");
        this.electricCarService = service;
    }

    public ElectricCarController() {
        System.out.println("ElectricCarController no argument constructor called");
    }

    public ElectricCarController(ElectricCarService service) {
        System.out.println("ElectricCarController argument constructor called");
        this.electricCarService = service;
    }

}
