package com.example.email2.model;

public class Customer {
    public String first_name;
    public String last_name;
    public String phone_number;
    public int customer_id;
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String firstName) {
        this.first_name = firstName;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String lastName) {
        this.last_name = lastName;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phoneNumber) {
        this.phone_number = phoneNumber;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customerId) {
        this.customer_id = customerId;
    }
}

