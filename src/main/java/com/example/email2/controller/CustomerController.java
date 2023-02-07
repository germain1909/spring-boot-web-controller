package com.example.email2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.email2.model.Customer;
import com.example.email2.service.CustomerServiceImpl;

@RestController
public class CustomerController {
    

    @Autowired
    private  CustomerServiceImpl customerService;

    @ResponseBody
    @GetMapping("/findCustomer/{phoneNumber}")
    public Customer retrieveCustomers(@PathVariable String phoneNumber) {
        // Customer jack = new Customer();
        // jack.setPhone_number(phoneNumber)
        Customer jack = customerService.findByPhoneNumber(phoneNumber);
        return jack;
    }
}



