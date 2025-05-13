package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelectUserById() {
        // 查询用户
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
    @Test
    void testInsert() {
        User user = new User();
        user.setName("张三");
        user.setTel("123456789");
        user.setAddress("北京市");
        System.out.println("添加成功");

    }
    @Test
    void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setName("李四");
        user.setTel("987654321");
        user.setAddress("上海市");
        System.out.println("修改成功");
    }

    @Test
    void testDelete() {
        int id = 1;
        userMapper.delete(id);
        System.out.println("删除成功");
    }
}
