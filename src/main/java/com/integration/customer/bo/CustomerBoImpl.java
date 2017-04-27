package com.integration.customer.bo;

 import java.util.List;

        import com.integration.customer.bo.CustomerBo;
        import com.integration.customer.dao.CustomerDao;
        import com.integration.customer.model.Customer;

public class CustomerBoImpl implements CustomerBo{

    CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void addCustomer(Customer customer){

        customerDao.addCustomer(customer);

    }

    public List<Customer> findAllCustomer(){

        return customerDao.findAllCustomer();
    }

}