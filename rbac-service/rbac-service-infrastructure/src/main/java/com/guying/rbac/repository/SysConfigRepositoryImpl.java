/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.repository;

import com.guying.rbac.domain.entity.SysConfig;
import com.guying.rbac.domain.gateway.SysConfigRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Component
public class SysConfigRepositoryImpl implements SysConfigRepository {
    @Autowired
    private SysConfigMapper sysConfigMapper;

    @Override
    public int insert(SysConfig sysConfig) {
        return sysConfigMapper.insert(sysConfig);
    }

    @Override
    public int update(SysConfig sysConfig) {
        return sysConfigMapper.updateById(sysConfig);
    }

    @Override
    public int deleteById(SysConfig sysConfig) {
        // 做逻辑删除
        return sysConfigMapper.updateById(sysConfig);
    }
}
