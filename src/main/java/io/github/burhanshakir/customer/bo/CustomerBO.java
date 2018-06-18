package io.github.burhanshakir.customer.bo;

import io.github.burhanshakir.customer.model.Customer;

import java.util.List;

public interface CustomerBO {

    void addCustomer(Customer customer);

    List<Customer> findAllCustomer();

}
