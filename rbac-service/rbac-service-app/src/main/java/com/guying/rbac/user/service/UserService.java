/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-04 00:55 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.user.service;

import com.guying.rbac.domain.user.entity.User;

import java.util.List;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2022-01-04 00:55 星期二
 */
public interface UserService {
    List<User> select();
}
