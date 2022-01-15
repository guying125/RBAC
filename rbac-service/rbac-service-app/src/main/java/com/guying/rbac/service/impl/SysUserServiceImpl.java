/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service.impl;

import com.guying.rbac.domain.domainservice.SysUserDomainService;
import com.guying.rbac.domain.entity.SysUser;
import com.guying.rbac.dto.UserRequest;
import com.guying.rbac.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * 描述：用户
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDomainService sysUserDomainService;

    @Override
    public List<SysUser> findAll() {
        return sysUserDomainService.findAll();
    }

    @Override
    public SysUser findByName(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String usrNam) {
        return null;
    }

    @Override
    public boolean save(UserRequest userRequest) {
        return false;
    }

    @Override
    public boolean delete(List<UserRequest> userRequestList) {
        return false;
    }
}
