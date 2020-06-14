package cn.edu.xmu.dto;

import cn.edu.xmu.model.User;
import lombok.Data;

/**
 * @author NieBin
 * @create 2020-06-08 11:23
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
