package com.pea2u.letter2future.dto;

import lombok.Data;

/**
 * @author wangzz
 * @date 2019年7月5日 15:14:26
 * 客户信息DTO
 */
@Data
public class CustomerDto {

    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String custName;

    /**
     * 微信ID
     */
    private String wxId;

    /**
     * 推送信息状态
     * 0：无推送 1：有推送
     */
    private Integer noticeStatus;

    /**
     * 收到信件数量
     */
    private Integer receiveLetterCount;

    /**
     * 用户标识
     */
    private String token;

}
