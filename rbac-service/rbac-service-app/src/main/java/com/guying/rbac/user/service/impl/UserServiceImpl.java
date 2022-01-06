/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-04 00:52 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.user.service.impl;

import com.guying.rbac.domain.entity.SysUser;
import com.guying.rbac.domain.user.domainservice.UserDomainService;
import com.guying.rbac.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2022-01-04 00:52 星期二
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDomainService userDomainService;

    @Override
    public List<SysUser> select() {
        return userDomainService.select();
    }
}
