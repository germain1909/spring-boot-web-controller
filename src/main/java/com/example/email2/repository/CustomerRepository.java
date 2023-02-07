package com.example.email2.repository;

import com.example.email2.model.Customer;

public interface CustomerRepository {
    Customer selectCustomer(String phoneNumber);
}
