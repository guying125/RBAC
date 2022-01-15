/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service.impl;

import com.guying.rbac.domain.domainservice.SysMenuDomainService;
import com.guying.rbac.dto.MenuRequest;
import com.guying.rbac.service.SysMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：菜单
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuDomainService sysMenuDomainService;

    @Override
    public boolean save(MenuRequest menuRequest) {
        return false;
    }

    @Override
    public boolean delete(List<MenuRequest> menuRequestList) {
        return false;
    }
}
