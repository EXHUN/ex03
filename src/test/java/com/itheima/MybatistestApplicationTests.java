package com.itheima;


import com.itheima.mapper.CommentMapper;
import com.itheima.pojo.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class MybatistestApplicationTests {
    @Autowired
    private CommentMapper commentMapper;
    @Test
    public void selectComment() {
        Comment comment = commentMapper.selectById(1);
        System.out.println(comment);}

}
