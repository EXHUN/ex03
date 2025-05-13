package com.itheima.mapper;

import com.itheima.pojo.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {
    // 查询方法
    // #{id}是一个是一个占位符，会被替换为实际的参数值
    @Select("SELECT * FROM t_comment WHERE id =#{id}")
    public Comment selectById(Integer id);

    // 插入一条信息
    @Insert("INSERT INTO t_comment(content,author,a_id) " +
            "values (#{content},#{author},#{a_id})")
    public int insertComment(Comment comment);
    // 更新一条信息，根据id更新content内容
    @Update("UPDATE t_comment SET content=#{content} WHERE id=#{id}")
    public int updateComment(Comment comment);

    // 删除一条信息 根据id删除
    @Delete("DELETE FROM t_comment WHERE id=#{id}")
    public int deleteComment(Integer id);

}
