/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.domain.domainservice;

import com.guying.rbac.domain.entity.SysUser;

import java.util.List;

/**
 * 描述：用户
 *
 * @author CODE POTER
 * @version 1.0
 */
public interface SysUserDomainService {
    /**
     * 查找所有用户
     *
     * @return 所有用户实体对象
     */
    List<SysUser> findAll();
}
