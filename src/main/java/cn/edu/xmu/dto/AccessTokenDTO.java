package cn.edu.xmu.dto;

import lombok.Data;

/**
 * @auther NieBin
 * @create 2020-05-24 17:06
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
