/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.domain.domainservice.impl;

import com.guying.rbac.domain.domainservice.SysUserDomainService;
import com.guying.rbac.domain.entity.SysUser;
import com.guying.rbac.domain.gateway.SysUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Component
public class SysUserDomainServiceImpl implements SysUserDomainService {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public List<SysUser> findAll() {
        log.info("查找所有用户-开始");
        List<SysUser> sysUsers = sysUserRepository.findAll();
        log.info("查找所有用户-完成");
        return sysUsers;
    }
}
