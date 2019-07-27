package com.pea2u.letter2future.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WxAuthErrorCodeEnum {

    SYS_BUSY(-1, "系统繁忙，稍后再试！"),
    SUCCESS(0, "请求成功"),
    CODE_INVALID(40029, "code 无效"),
    FAST_TIMES(45011, "频率限制，每个用户每分钟100次"),
    FAIL(1, "未知错误"),;

    private int errcode;

    private String remark;

    public static WxAuthErrorCodeEnum getByErrCode(int errcode) {
        for(WxAuthErrorCodeEnum wxAuthErrorCode : WxAuthErrorCodeEnum.values()) {
            if (wxAuthErrorCode.getErrcode() == errcode) {
                return wxAuthErrorCode;
            }
        }
        return FAIL;
    }

}
