/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.domain.domainservice;

import com.guying.rbac.domain.entity.SysConfig;

import java.util.List;

/**
 * 描述：配置
 *
 * @author CODE POTER
 * @version 1.0
 */
public interface SysConfigDomainService {
    boolean insert(SysConfig sysConfig);

    boolean delete();

    boolean update(SysConfig sysConfig);

    List<SysConfig> findPage();

    List<SysConfig> findByLabel();

    boolean deleteById(Long id, String lstUpdBy);
}
