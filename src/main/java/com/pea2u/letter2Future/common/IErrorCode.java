package com.pea2u.letter2Future.common;

/**
 * 封装API的错误码
 * Created by macro on 2019/4/19.
 */
public interface IErrorCode {

    /**
     * 获取操作码
     * @return 错误码
     */
    long getCode();

    /**
     * 获取错误信息
     * @return 错误信息
     */
    String getMessage();
}
