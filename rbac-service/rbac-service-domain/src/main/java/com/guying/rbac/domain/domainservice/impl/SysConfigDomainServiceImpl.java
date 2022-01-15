/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.domain.domainservice.impl;

import com.guying.rbac.domain.domainservice.SysConfigDomainService;
import com.guying.rbac.domain.entity.SysConfig;
import lombok.extern.slf4j.Slf4j;
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
public class SysConfigDomainServiceImpl implements SysConfigDomainService {
    @Override
    public boolean save() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public List<SysConfig> findPage() {
        return null;
    }

    @Override
    public List<SysConfig> findByLabel() {
        return null;
    }
}
