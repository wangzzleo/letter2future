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
public class CustomerQO {

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
     * 微信登录code
     */
    private String code;

    /**
     * 用户标识
     */
    private String token;

}
