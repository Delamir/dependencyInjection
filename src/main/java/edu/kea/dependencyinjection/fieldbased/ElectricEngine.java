package edu.kea.dependencyinjection.fieldbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ElectricEngine {

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
}
