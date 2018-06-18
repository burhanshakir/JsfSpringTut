package io.github.burhanshakir.customer.bo.impl;

import io.github.burhanshakir.customer.bo.CustomerBO;
import io.github.burhanshakir.customer.dao.CustomerDao;
import io.github.burhanshakir.customer.model.Customer;

import java.util.List;

public class CustomerBoImpl implements CustomerBO {

    CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void addCustomer(Customer customer) {

        customerDao.addCustomer(customer);

    }

    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }
}
