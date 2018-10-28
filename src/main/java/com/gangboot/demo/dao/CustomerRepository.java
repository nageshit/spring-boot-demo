package com.gangboot.demo.dao;

import com.gangboot.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByAge(int age);
}
