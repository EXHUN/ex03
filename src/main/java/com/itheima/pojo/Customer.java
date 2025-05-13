package com.itheima.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Customer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;
}
