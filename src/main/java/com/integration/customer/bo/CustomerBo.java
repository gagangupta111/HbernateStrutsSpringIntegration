package com.integration.customer.bo;

        import java.util.List;
        import com.integration.customer.model.Customer;

public interface CustomerBo{

    void addCustomer(Customer customer);

    List<Customer> findAllCustomer();

}