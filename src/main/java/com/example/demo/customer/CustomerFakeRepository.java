package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomer() {
        return Arrays.asList(
                new Customer(1L,"James Bond","password123", "james@email.com"),
                new Customer(2L, "Jamila Ahmed", "password123", "jamila@email.com")
        );
    }
}
