package com.itheima;

import com.itheima.mapper.ArticleMapper;
import com.itheima.pojo.Article;
import com.itheima.pojo.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ArticleMapperTests {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void selectArticle() {
        // 查询文章
        Article article = articleMapper.selectArticle(1);

        // 查询文章的评论列表
        List<Comment> commentList = articleMapper.selectCommentList(1);

        // 将评论列表设置到文章对象中
        article.setCommentList(commentList);

        // 打印文章对象
        System.out.println(article);
    }
}