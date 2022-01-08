/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.user.service.impl;

import com.guying.rbac.domain.domainservice.SysUserDomainService;
import com.guying.rbac.domain.entity.SysUser;
import com.guying.rbac.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDomainService sysUserDomainService;

    @Override
    public List<SysUser> findAll() {
        return sysUserDomainService.findAll();
    }
}
