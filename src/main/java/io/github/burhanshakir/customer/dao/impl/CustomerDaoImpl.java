package io.github.burhanshakir.customer.dao.impl;

import io.github.burhanshakir.customer.dao.CustomerDao;
import io.github.burhanshakir.customer.model.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.Date;
import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{



    public void addCustomer(Customer customer)
    {
        customer.setCreatedDate(new Date());
        getHibernateTemplate().save(customer);

    }

    public List<Customer> findAllCustomer()
    {
//        getHibernateTemplate().find("from Customer")

        return null;
    }
}
