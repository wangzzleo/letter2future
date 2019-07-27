package com.pea2u.letter2future.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangzz
 * @date 2019年7月5日 15:14:26
 * 客户信息DTO
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

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
     * token
     */
    private String token;

    /**
     * 用户状态
     * 0：正常 1：锁定 2：注销 3:初次注册 4:微信登录失败
     */
    private Integer status;
}
