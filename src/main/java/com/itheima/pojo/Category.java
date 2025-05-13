package com.itheima.pojo;


import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Category {
    private Integer cate_id;
    private String cate_name;
}
