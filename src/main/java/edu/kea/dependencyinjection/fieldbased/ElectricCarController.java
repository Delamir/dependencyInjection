package edu.kea.dependencyinjection.fieldbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectricCarController {

    // Spring opretter service objekt og injecter
    @Autowired
    private ElectricCarService electricCarService;

    @GetMapping("/electricCar")
    public String getBrand(){
        return electricCarService.getBrand();
    }
}
