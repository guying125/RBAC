/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-04 00:35 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.repository;

import com.guying.rbac.domain.user.entity.User;
import com.guying.rbac.domain.user.entity.User22;
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
 * @date 2022-01-04 00:35 星期二
 */
@Slf4j
@Component
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public List<User> select() {
        List<User> users = userMapper.selectList(null);
        log.info("mp结果：[{}]", users);
        List<User22> select = sysUserMapper.select();
        log.info("m结果：[{}]", select);
        return users;
    }
}
