/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-04 00:34 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.domain.user.domainservice.impl;

import com.guying.rbac.domain.entity.SysUser;
import com.guying.rbac.domain.user.domainservice.UserDomainService;
import com.guying.rbac.domain.user.gateway.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2022-01-04 00:34 星期二
 */
@Slf4j
@Component
public class UserDomainServiceImpl implements UserDomainService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<SysUser> select() {
        log.info("开始查询=========================");
        List<SysUser> users = userRepository.select();
        log.info("输出查询结果：{}", users);
        return users;
    }
}
