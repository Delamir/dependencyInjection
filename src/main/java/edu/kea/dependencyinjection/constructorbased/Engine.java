package edu.kea.dependencyinjection.constructorbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Engine {

    @Bean
    public String type() {
        return "v8";
    }

    @Bean
    public boolean turbo() {
        return true;
    }

    @Bean
    public String brand() {
        return "Audi";
    }






    @Bean
    public String superCar() { return  "Ferrari"; }
}
