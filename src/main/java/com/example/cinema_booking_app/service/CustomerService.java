package com.example.cinema_booking_app.service;

import com.example.cinema_booking_app.model.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Long id);
    Customer addCustomer(Customer customer);
    Optional<Customer> updateCustomer(Long id, Customer customerDetails);
    boolean deleteCustomer(Long id);
}
