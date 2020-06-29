package cn.edu.xmu.dto;

import lombok.Data;

/**
 * 问题查询的数据
 * @author NieBin
 * @create 2020-06-13 15:53
 */
@Data
public class QuestionQueryDTO {
    private String search;//关键字
    private Integer offset;//偏移量，与分页有关
    private Integer size;//当前页码放多少个问题
}
