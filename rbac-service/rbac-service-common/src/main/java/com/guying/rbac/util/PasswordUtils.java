/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2020-07-30 01:53 星期四
 * ==============   ===============     =================================
 */
package com.guying.rbac.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * 描述：密码工具类——密码的生成、加密、解密等
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2020-07-30 01:53 星期四
 */
public class PasswordUtils {

    private static final String STRING_SHORT_BAR = "-";

    /**
     * 获取加密盐
     *
     * @return 盐
     */
    public static String getSalt() {
        return UUID.randomUUID().toString().replace(STRING_SHORT_BAR, StringUtils.EMPTY).substring(0, 20);
    }

    /**
     * 明文密码加密
     *
     * @param rawPass 明文
     * @param salt    盐
     * @return 密文
     */
    public static String encode(String rawPass, String salt) {
        return new PasswordEncoder(salt).encode(rawPass);
    }

    /**
     * 匹配密码
     *
     * @param salt    盐
     * @param rawPass 明文
     * @param encPass 密文
     * @return true|false
     */
    public static boolean matches(String salt, String rawPass, String encPass) {
        return new PasswordEncoder(salt).matches(encPass, rawPass);
    }
}
