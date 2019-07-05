package com.pea2u.letter2future.common;

/**
 * @author wangzz
 * @date 2019年7月4日 16:07:12
 */
public class CommonResult<T> {

    private int code;
    private String message;
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
