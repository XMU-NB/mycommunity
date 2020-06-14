package cn.edu.xmu.dto;

import lombok.Data;

import java.util.List;

/**
 * @author NieBin
 * @create 2020-06-10 20:06
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
