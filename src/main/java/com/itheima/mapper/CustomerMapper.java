package com.itheima.mapper;

import com.itheima.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CustomerMapper {
    List<Customer> selectCustomer(Customer customer);

}
