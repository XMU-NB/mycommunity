package cn.edu.xmu.model;

import lombok.Data;

/**
 * @author NieBin
 * @create 2020-05-30 20:09
 */
@Data
public class Question {
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
}
