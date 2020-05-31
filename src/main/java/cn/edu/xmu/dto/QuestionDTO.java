package cn.edu.xmu.dto;

import cn.edu.xmu.model.User;
import lombok.Data;

/**
 * @auther NieBin
 * @create 2020-05-24 17:06
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
