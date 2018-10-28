package com.gangboot.demo.service;

import com.gangboot.demo.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomerServiceImpl implements CustomerService {



    @Override
    public Collection<Customer> getAllCustomers() {


        return null;

    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }

    @Override
    public void removeCustomerById(int id) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void insertCustomer(Customer customer) {

    }
}
