package com.itheima;

import com.itheima.mapper.ArticleMapper;
import com.itheima.mapper.CommentMapper;
import com.itheima.mapper.GoodsMapper;
import com.itheima.pojo.Article;
import com.itheima.pojo.Comment;
import com.itheima.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Ex03ApplicationTests {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private Goods goods;

    @Test
    void contextLoads() {
        Comment comment = commentMapper.selectById(1);
        System.out.println(comment);
    }
    @Test
    void testSelectById() {
        Comment comment = new Comment();
        comment.setContent("测试内容");
        comment.setAuthor("测试作者");
        comment.setA_id(1);
        commentMapper.insertComment(comment);
        System.out.println("添加成功");
    }
    @Test
    void testUpdateComment() {
        Comment comment = new Comment();
        comment.setId(11);
        comment.setContent("这是一条修改后的评论");
        commentMapper.updateComment(comment);
        System.out.println("修改成功");
    }
    @Test
    void testDeleteComment() {
        commentMapper.deleteComment(11);
        System.out.println("删除成功");
    }

    @Test
    // 根据id查询商品
    void testSelectGoodsById() {
        List<Goods> goods = goodsMapper.selectById(1);
        for (Goods good : goods) {
            System.out.println(good);
        }
    }

    @Test
    // 查询所有商品
    void testSelectGoodsAll() {
        List<Goods> goodss = goodsMapper.selectAll();
        for (Goods good : goodss) {
            System.out.println(good);
        }
    }


    @Test
    // 添加商品
    void testInsertGoods() {
        Goods goods = new Goods();
        goods.setGoods_name("测试商品");
        goods.setGoods_price(100.0);
        goods.setGoods_disc("测试商品描述");
        goods.setCate_id(1);
        goods.setGoods_stock(10);
        goodsMapper.insertGoods(goods);
        System.out.println("添加成功");
    }

    // 根据id删除商品
    @Test
    void testDeleteGoods() {
        goodsMapper.deleteGoods(98);
        System.out.println("删除成功");
    }

    // 根据id更新商品
    @Test
    void testUpdateGoods() {
        Goods goods = new Goods();
        goods.setGoods_id(1);
        goods.setGoods_price(100.0);
        goodsMapper.updateGoods(goods);
        System.out.println("修改成功");
    }

    @Test
    // 根据id查询文章
    void testSelectArticleById() {
        Article article = articleMapper.selectArticle(4);
        System.out.println(article);
    }

    @Test
    // 查询全部文章
    void testSelectAll() {
        List<Article> articles = articleMapper.selectAll(1);
        for (Article article : articles) {
            System.out.println(article);
        }
    }

    @Test
    // 添加文章
    void testInsertArticle() {
        Article article = new Article();
        article.setTitle("哈利波特与魔法石");
        article.setContent("这是哈利波特的一本书");
        articleMapper.insertArticle(article);
        System.out.println("添加成功");
    }

    @Test
    // 根据id更新文章内容
    void testUpdateArticle() {
        Article article = new Article();
        article.setId(5);
        article.setContent("这是一本哈利波特的新书");
        articleMapper.updateArticle(article);
        System.out.println("修改成功");
    }

    @Test
    // 根据id删除文章
    void testDeleteArticle() {
        articleMapper.deleteArticle(5);
        System.out.println("删除成功");
    }

    @Test
    void testInsertArticleByColumn() {
        articleMapper.insertArticleByColumn("哈利波特之死亡圣器", "这是哈利波特最后一本书");
        System.out.println("添加成功");
    }
}
