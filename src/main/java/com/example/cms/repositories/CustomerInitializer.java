package com.example.cms.repositories;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerInitializer implements ApplicationRunner {

    private final CustomerRepository customerRepository;

    CustomerInitializer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        var names = Flux.just("Imrul", "Andrew", "Jessica", "Rastko");
//        var customers = names.map(n -> new Customer(null, n));
//        var saved = customers.flatMap(this.customerRepository::save);
//        saved.subscribe(System.out::println);
    }
}
