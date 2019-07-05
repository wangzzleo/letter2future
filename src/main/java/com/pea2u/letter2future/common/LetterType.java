package com.pea2u.letter2future.common;

/**
 * @author wangzz
 * 信件类型
 */
public enum LetterType {

    /**
     * 公开信
     */
    PRIVATE_LETTER(0,"公开信"),
    /**
     * 私密信
     */
    PULIC_LETTER(1,"私密信");

    private int code;
    private String name;

    LetterType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
