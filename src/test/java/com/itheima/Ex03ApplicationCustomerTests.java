package com.itheima;

import com.itheima.mapper.CustomerMapper;
import com.itheima.pojo.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Ex03ApplicationCustomerTests {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private Customer customer;

    @Test
    public void selectCustomer() {
        customer.setUsername("li");
        customer.setJobs("student");
        List<Customer> cus = customerMapper.selectCustomer(customer);
        System.out.println(cus);
    }
}
