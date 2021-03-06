package com.integration.customer.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;
import com.integration.customer.bo.CustomerBo;
import com.integration.customer.form.CustomerForm;
import com.integration.customer.model.Customer;

public class AddCustomerAction extends ActionSupport{

    public ActionForward execute(ActionMapping mapping,ActionForm form,
                                 HttpServletRequest request,HttpServletResponse response)
            throws Exception {

        CustomerBo customerBo =
                (CustomerBo) getWebApplicationContext().getBean("customerBo");

        CustomerForm customerForm = (CustomerForm)form;
        Customer customer = new Customer();

        //copy customerform to model
        BeanUtils.copyProperties(customer, customerForm);

        //save it
        customerBo.addCustomer(customer);

        return mapping.findForward("success");

    }

}