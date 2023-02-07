package com.example.email2.repository;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.email2.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SELECT_USER = "SELECT customer_id, first_name, last_name, phone_number FROM temp.customers WHERE phone_number = ?";
    private RowMapper<Customer> customerMapper  = new RowMapper<Customer>(){
        @Override
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer = new Customer();
            customer.setFirst_name(rs.getString("first_name"));
            customer.setLast_name(rs.getString("last_name"));
            customer.setCustomer_id(rs.getInt("customer_id"));
            customer.setPhone_number(rs.getString("phone_number"));
            return customer;
        }
    };

    @Override
    public Customer selectCustomer(String phoneNumber) {
    
        try {
            Customer customer = jdbcTemplate.queryForObject(SELECT_USER, customerMapper,phoneNumber);
            return customer;
       } 
       catch (EmptyResultDataAccessException e) {
        Customer customerNotFound = new Customer();
        customerNotFound.setFirst_name("not found");
        customerNotFound.setCustomer_id(0);
        customerNotFound.setLast_name("not found");
        customerNotFound.setPhone_number(phoneNumber);
          return customerNotFound;
       }
    }
    
}


