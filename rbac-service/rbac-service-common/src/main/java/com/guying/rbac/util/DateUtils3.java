/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-04 23:26 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * 描述：日期-工具类
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2022-01-04 23:26 星期二
 */
public class DateUtils3 {
    private DateUtils3() {}

    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private static final String[] PARSE_PATTERNS = {
            YYYY_MM_DD, YYYY_MM_DD_HH_MM_SS, "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

    /**
     * 获取系统当前日期时间
     */
    public static LocalDateTime grabCurrentDateTime() {
        return LocalDateTime.now();
    }

    /**
     * 获取系统当前日期
     */
    public static LocalDate grabCurrentDate() {
        return LocalDate.now();
    }

    /**
     * 获取系统当前时间
     */
    public static LocalTime grabCurrentTime() {
        return LocalTime.now();
    }

    /**
     * 当前日期字符串
     * 默认格式：yyyy-MM-dd
     */
    public static String getDate() {
        return getDate(YYYY_MM_DD);
    }

    /**
     * 当前日期字符串
     * 指定格式 pattern
     */
    public static String getDate(String pattern) {
        return getDate(grabCurrentDateTime(), pattern);
    }

    /**
     * 日期时间转换为字符串
     * 默认格式：YY_MM_DD
     */
    public static String getDate(LocalDateTime localDateTime, String... pattern) {
        if (null != pattern && pattern.length > 0) {
            if (!Arrays.asList(PARSE_PATTERNS).contains(pattern[0])) {
                throw new RuntimeException("日期转换异常");
            }

            return DateTimeFormatter.ofPattern(pattern[0]).format(localDateTime);
        }
        return DateTimeFormatter.ofPattern(YYYY_MM_DD).format(localDateTime);
    }
}
