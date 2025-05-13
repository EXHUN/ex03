package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    // 针对t_user表的操作
    // 1. 根据id查找
    @Select("select * from t_user where id=#{id}")
    public User selectById(int id);

    @Insert("insert into t_user (name,tel,address) values (#{name},#{tel},#{address})")
    public int insert(User user);

    @Update("update t_user set name=#{name} where id=#{id}")
    public int update(User user);

    @Delete("delete from t_user where id=#{id}")
    public int delete(int id);

}
