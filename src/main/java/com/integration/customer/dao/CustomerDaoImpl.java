package com.integration.customer.dao;

import java.util.Date;
import java.util.List;
import com.integration.customer.dao.CustomerDao;
import com.integration.customer.model.Customer;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

    public void addCustomer(Customer customer){

        customer.setCreatedDate(new Date());
        getHibernateTemplate().save(customer);

    }

    public List<Customer> findAllCustomer(){

        return getHibernateTemplate().find("from Customer");

    }
}