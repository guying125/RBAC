/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service.impl;

import com.alibaba.cola.dto.PageQuery;
import com.guying.rbac.domain.domainservice.SysConfigDomainService;
import com.guying.rbac.domain.entity.SysConfig;
import com.guying.rbac.dto.ConfigDTO;
import com.guying.rbac.dto.ConfigRequest;
import com.guying.rbac.service.SysConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：配置
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Service
public class SysConfigServiceImpl implements SysConfigService {
    @Autowired
    private SysConfigDomainService sysConfigDomainService;

    @Override
    public boolean save(ConfigRequest configRequest) {
        return sysConfigDomainService.save();
    }

    @Override
    public boolean delete(List<ConfigRequest> configRequestList) {
        return sysConfigDomainService.delete();
    }

    @Override
    public boolean update(ConfigRequest configRequest) {
        return sysConfigDomainService.update();
    }

    @Override
    public List<ConfigDTO> findPage(PageQuery pageQuery) {
        List<SysConfig> sysConfigList = sysConfigDomainService.findPage();
        return new ArrayList<>();
    }

    @Override
    public List<ConfigDTO> findByLabel(String label) {
        List<SysConfig> sysConfigList = sysConfigDomainService.findByLabel();
        return new ArrayList<>();
    }
}
