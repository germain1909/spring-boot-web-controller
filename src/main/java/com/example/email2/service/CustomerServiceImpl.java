package com.example.email2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.email2.model.Customer;
import com.example.email2.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer findByPhoneNumber(String phoneNumber){
        return customerRepository.selectCustomer(phoneNumber);
    }
    
}
