package edu.kea.dependencyinjection.fieldbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricCarService {

    @Autowired
    private ElectricCarRepo electricCarRepo;

    String getBrand(){
        return electricCarRepo.brand();
    }


}
