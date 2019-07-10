package com.pea2u.letter2future.util;

/**
 * @author wangzz
 * @date 2019年7月10日13:48:46
 * 字符串工具类
 */
public class StringUtils {

    /**
     * 是否空字符串
     * @param str 字符串
     * @return 是否为空
     */
    public static boolean isBlank(String str) {
        return str == null || "".equals(str);
    }

}
