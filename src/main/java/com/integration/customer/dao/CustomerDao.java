package com.integration.customer.dao;

        import java.util.List;

        import com.integration.customer.model.Customer;

public interface CustomerDao{

    void addCustomer(Customer customer);

    List<Customer> findAllCustomer();

}