/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service.impl;

import com.guying.rbac.domain.domainservice.SysRoleDomainService;
import com.guying.rbac.dto.RoleRequest;
import com.guying.rbac.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：角色
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleDomainService sysRoleDomainService;

    @Override
    public boolean save(RoleRequest roleRequest) {
        return false;
    }

    @Override
    public boolean delete(List<RoleRequest> roleRequestList) {
        return false;
    }
}
