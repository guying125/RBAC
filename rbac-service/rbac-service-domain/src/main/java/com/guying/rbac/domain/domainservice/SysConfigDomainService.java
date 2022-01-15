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
    boolean save();

    boolean delete();

    boolean update();

    List<SysConfig> findPage();

    List<SysConfig> findByLabel();
}
