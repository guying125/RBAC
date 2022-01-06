/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-04 00:39 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.test;

import com.guying.rbac.domain.entity.SysUser;
import com.guying.rbac.domain.user.domainservice.UserDomainService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserDomainServiceImplTest {
    @Autowired
    private UserDomainService userDomainService;

    @Test
    public void select() {
        List<SysUser> users = userDomainService.select();
        Assertions.assertEquals(5, users.size());
        System.out.println(users);
    }

    @Test
    public void selectList2() {
        System.out.println("ok");
    }
}