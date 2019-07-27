package com.pea2u.letter2future.dto;

import lombok.Data;

/**
 * @author wangzz
 * @date 2019年7月5日 13:19:21
 * 信件DTO
 */
@Data
public class LetterDTO {

    /**
     * 信件ID
     */
    private Integer id;

    /**
     * 写信人
     */
    private Integer custId;

    /**
     * 写信人名称
     */
    private String custName;

    /**
     * 信件标题
     */
    private String letterTitle;

    /**
     * 信件内容
     */
    private String letterContent;

    /**
     * 信件来源
     * （0：小程序 1：web端 2：支付宝小程序 3：公众号）
     */
    private Integer letterSource;

    /**
     * 信件类型
     * (0:私密 1:公开)
     */
    private Integer letterType;

    /**
     * 点赞值
     */
    private Integer hotPoint;

}
