package cn.edu.xmu.dto;

import lombok.Data;

/**
 * @author NieBin
 * @create 2020-06-13 15:53
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
