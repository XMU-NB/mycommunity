package cn.edu.xmu.dto;

import lombok.Data;

/**
 * @author NieBin
 * @create 2020-06-11 14:35
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
