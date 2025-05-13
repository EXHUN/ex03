package com.itheima.mapper;

import com.itheima.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    public List<Goods> selectById(Integer id);
    public List<Goods> selectAll();
    public void insertGoods(Goods goods);
    public void deleteGoods(Integer id);
    public void updateGoods(Goods goods);
}
