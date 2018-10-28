package com.gangboot.demo.service;

import com.gangboot.demo.entity.Customer;


import java.util.Collection;

public interface CustomerService {

    Collection<Customer> getAllCustomers();
    Customer getCustomerById(int id);

    void removeCustomerById(int id);

    void updateCustomer(Customer customer);

    void insertCustomer(Customer customer);
}
