package cn.edu.xmu.mapper;

import cn.edu.xmu.model.Comment;
import cn.edu.xmu.model.CommentExample;
import cn.edu.xmu.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}