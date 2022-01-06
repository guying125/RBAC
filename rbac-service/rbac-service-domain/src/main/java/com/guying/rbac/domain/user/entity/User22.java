/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-02 18:36 星期日
 * ==============   ===============     =================================
 */
package com.guying.rbac.domain.user.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2022-01-02 18:36 星期日
 */
@Data
public class User22 {
    private long id;
    private String name;
    private int age;
    private String managerId;
    private LocalDateTime createTime;
}
