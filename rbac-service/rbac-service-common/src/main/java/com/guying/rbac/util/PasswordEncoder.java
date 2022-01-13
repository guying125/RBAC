/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2020-07-31 00:17 星期五
 * ==============   ===============     =================================
 */
package com.guying.rbac.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * 描述：密码加密
 *
 * @author CODE POTER
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordEncoder {

    private static final String[] HEX_DIGITS
            = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    private static final String MD5 = "MD5";
    private static final String SHA = "SHA";

    private Object salt;
    private String algorithm;

    public PasswordEncoder(Object salt) {
        this(salt, MD5);
    }

    /**
     * 密码匹配验证
     *
     * @param encPass 密文
     * @param rawPass 明文
     * @return true|false
     */
    public boolean matches(String encPass, String rawPass) {
        String pwd1 = StringUtils.EMPTY + encPass;  // 防止为空
        String pwd2 = encode(rawPass);              // 明文加密

        return pwd1.equals(pwd2);
    }

    /**
     * 密码加密
     *
     * @param rawPass 明文
     * @return 密文
     */
    public String encode(String rawPass) {
        String result = null;
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            result =
                    byteArrayToHexString(md.digest(mergePasswordAndSalt(rawPass).getBytes(StandardCharsets.UTF_8.name())));
        } catch (Exception ignored) {
        }
        return result;
    }

    /**
     * 转换字节数组为16进制字串
     *
     * @param b 字节数组
     * @return 16进制字串
     */
    private String byteArrayToHexString(byte[] b) {
        StringBuilder resultSb = new StringBuilder();
        for (byte value : b) {
            resultSb.append(byteToHexString(value));
        }
        return resultSb.toString();
    }

    /**
     * 将字节转换为16进制
     *
     * @param value 字节
     * @return 字节的十六进制结果
     */
    private String byteToHexString(byte value) {
        int n = value;
        if (n < 0) { n = 1 << 8 + n; }
        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }

    /**
     * 合并密码和盐
     *
     * @param password 明文
     * @return 合并密码和盐的结果
     */
    private String mergePasswordAndSalt(String password) {
        if (password == null) {
            password = StringUtils.EMPTY;
        }

        if ((salt == null) || StringUtils.EMPTY.equals(salt)) {
            return password;
        } else {
            return password + "{" + salt.toString() + "}";
        }
    }
}
