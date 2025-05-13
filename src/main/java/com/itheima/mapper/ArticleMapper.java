package com.itheima.mapper;

import com.itheima.pojo.Article;
import com.itheima.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {
    public Article selectArticle(Integer id);
    public List<Comment> selectCommentList(Integer id);
    public List<Article> selectAll(Integer id);
    public void insertArticle(Article article);
    public void updateArticle(Article article);
    public void deleteArticle(Integer id);
    public void insertArticleByColumn(
            @Param("title") String title,
            @Param("content") String content);
}
