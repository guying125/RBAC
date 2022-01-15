/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述：正则表达式
 *
 * @author CODE POTER
 * @version 1.0
 */
public class RegExpValidatorUtils {
    private RegExpValidatorUtils() {}

    public static final String LONG_NUMBER_REGEXP = "^\\d+[Ll]?$";

    /**
     * 检查是否匹配正则表达式
     *
     * @param regex  正则表达式
     * @param source 待校验串
     * @return true匹配成功，false匹配失败
     */
    public static boolean match(String regex, String source) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        return matcher.matches();
    }

    /**
     * Long整型校验
     *
     * @param regex  正则表达式
     * @param source 待校验串
     * @return true匹配成功，false匹配失败
     */
    public static boolean longNumberMatch(String regex, String source) {
        // 如果source为空，直接返回为true
        if (StringUtils.isBlank(source)) {return true;}
        // 否则按照正则判断
        return match(regex, source);
    }
}
