/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.domain.domainservice.impl;

import com.guying.rbac.consts.StatusConsts;
import com.guying.rbac.domain.domainservice.SysConfigDomainService;
import com.guying.rbac.domain.entity.SysConfig;
import com.guying.rbac.domain.gateway.SysConfigRepository;
import com.guying.rbac.util.DateUtils3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
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
    @Autowired
    private SysConfigRepository sysConfigRepository;

    @Override
    public boolean insert(SysConfig sysConfig) {
        int rows = sysConfigRepository.insert(sysConfig);
        return rows == 1;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public boolean update(SysConfig sysConfig) {
        int rows = sysConfigRepository.update(sysConfig);
        return rows == 1;
    }

    @Override
    public List<SysConfig> findPage() {
        return null;
    }

    @Override
    public List<SysConfig> findByLabel() {
        return null;
    }

    @Override
    public boolean deleteById(Long id, String lstUpdBy) {
        LocalDateTime localDateTime = DateUtils3.grabCurrentDateTime();

        SysConfig sysConfig = new SysConfig();
        sysConfig.setId(id);
        sysConfig.setLstUpdBy(lstUpdBy);
        sysConfig.setLstUpdTim(localDateTime);
        sysConfig.setDelFlg(StatusConsts.DELETED_STATUS);

        int rows = sysConfigRepository.deleteById(sysConfig);
        return rows == 1;
    }
}
