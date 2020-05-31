package cn.edu.xmu.model;

import lombok.Data;

/**
 * @auther NieBin
 * @create 2020-05-28 20:00
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
