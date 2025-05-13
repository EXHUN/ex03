package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Mapper
@Component
public class Goods {
    private Integer goods_id;
    private Integer cate_id;
    private String goods_name;
    private String goods_disc;
    private Double goods_price;
    private Integer goods_stock;
    private List<Category> categoryList; // 关联的分类列表
}
