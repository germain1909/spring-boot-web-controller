package com.example.email2.service;

import com.example.email2.model.Customer;

public interface CustomerService {

    Customer findByPhoneNumber(String phoneNumber);
    
}
