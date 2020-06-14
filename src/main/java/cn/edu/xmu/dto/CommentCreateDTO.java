package cn.edu.xmu.dto;

import lombok.Data;

/**
 * @author NieBin
 * @create 2020-06-05 15:26
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
