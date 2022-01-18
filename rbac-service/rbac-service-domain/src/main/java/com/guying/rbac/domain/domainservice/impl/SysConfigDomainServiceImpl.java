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
        // 唯一性检查，只检查正常状态的
        SysConfig currConfig = sysConfigRepository.selectByValue(sysConfig.getValue(), StatusConsts.NORMAL_STATUS);

        if (null != currConfig) {
            log.error("无法新增，已有配置(且状态为正常-NORMAL)");
            return false;
        }

        int rows = sysConfigRepository.insert(sysConfig);
        return rows == 1;
    }

    @Override
    public boolean deleteById(Long id, String lstUpdBy) {
        // 删除前先检查状态
        SysConfig sysConfig = sysConfigRepository.selectById(id);
        if (null == sysConfig) {
            // 如果查询配置为空，则抛出
            throw new RuntimeException("查询为空");
        }
        if (StatusConsts.DELETED_STATUS.equals(sysConfig.getDelFlg())) {
            throw new RuntimeException("该条记录已删除，将无法再次删除");
        }

        LocalDateTime localDateTime = DateUtils3.grabCurrentDateTime();

        SysConfig config4Upd = new SysConfig();
        config4Upd.setId(id);
        config4Upd.setLstUpdBy(lstUpdBy);
        config4Upd.setLstUpdTim(localDateTime);
        config4Upd.setDelFlg(StatusConsts.DELETED_STATUS);

        int rows = sysConfigRepository.deleteById(config4Upd);
        return rows == 1;
    }

    @Override
    public boolean update(SysConfig sysConfig) {
        // 是否存在检查
        Long id = sysConfig.getId();
        SysConfig currConfig = sysConfigRepository.selectById(id);
        if (null == currConfig) {
            // 如果查询配置为空，则抛出
            log.error("查询为空，无法更新");
            return false;
        }
        if (StatusConsts.DELETED_STATUS.equals(currConfig.getDelFlg())) {
            log.error("该条记录已删除，将无法更新");
            return false;
        }

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
}
