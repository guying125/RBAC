/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.domain.gateway;

import com.guying.rbac.domain.entity.SysConfig;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 */
public interface SysConfigRepository {
    int insert(SysConfig sysConfig);

    int update(SysConfig sysConfig);

    int deleteById(SysConfig sysConfig);

}
