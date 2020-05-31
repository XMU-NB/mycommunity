package cn.edu.xmu.dto;

import lombok.Data;

/**
 * @auther NieBin
 * @create 2020-05-24 18:14
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
