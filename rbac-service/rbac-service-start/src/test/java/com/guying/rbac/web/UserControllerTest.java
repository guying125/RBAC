/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-04 01:00 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.web;

import com.guying.rbac.domain.entity.SysUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserControllerTest {
    @Autowired
    private UserController userController;

    @Test
    void selectList() {
        List<SysUser> users = userController.select();
        Assertions.assertEquals(8, users.size());
        System.out.println(users);
    }
}