package com.pea2u.letter2future.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 0：正常 1：锁定 2：注销 3:初次注册
 */
@AllArgsConstructor
@Getter
public enum CustomerStatusEnum {

    NORMAL(0, "正常"),
    LOCKING(1, "锁定"),
    CLOSED(2, "注销"),
    FIRST_REGISTER(3, "初次注册"),
    WX_LOGIN_FAIL(4, "微信登录失败");

    private int status;

    private String remark;


}
