package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    long countByState(String state);
    Iterable<Customer> findAllByLastNameContainingIgnoreCase(String lastName);
    Iterable<Customer> findAllByCityAndState(String city, String state);
}
