package com.Test;

import com.dao.CustomerDao;
import com.po.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void findCustomerByIdTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = applicationContext.getBean(CustomerDao.class);
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }
}
