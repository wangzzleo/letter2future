package com.pea2u.letter2future.common;

/**
 * @author wangzz
 * 信件渠道枚举
 */
public enum LetterChannelEnum {

    /**
     * 微信小程序
     */
    MINI_PROGRAM(0,"mini_program","小程序"),
    /**
     * 官方网站
     */
    WEB(1,"web","官方网站"),
    /**
     * 支付宝小程序
     */
    ALIPAY_MINI_PROGRAM(2,"alipay_mini_program","支付宝小程序"),
    /**
     * 微信公众号
     */
    OFFICIAL_ACCOUNTS(3,"official_accounts","微信公众号");


    private int code;
    private String alias;
    private String name;

    LetterChannelEnum(int code, String alias, String name) {
        this.code = code;
        this.alias = alias;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
