package io.github.burhanshakir.customer.dao;

import io.github.burhanshakir.customer.model.Customer;

import java.util.List;

public interface CustomerDao {

    void addCustomer(Customer customer);

    List<Customer> findAllCustomer();
}
