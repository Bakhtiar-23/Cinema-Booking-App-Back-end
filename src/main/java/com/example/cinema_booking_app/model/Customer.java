package com.example.cinema_booking_app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers") // Use lowercase and plural for table naming conventions
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId; // Unique identifier for the customer

    private String name;      // Customer's name
    private String email;     // Customer's email

    // Default constructor
    public Customer() {
        super();
    }

    // Parameterized constructor
    public Customer(Long customerId, String name, String email) {
        super();
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + "]";
    }
}
