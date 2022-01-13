/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service;

import com.guying.rbac.domain.entity.SysUser;

import java.util.List;
import java.util.Set;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 */
public interface SysUserService {
    List<SysUser> findAll();

    SysUser findByName(String username);

    Set<String> findPermissions(String usrNam);
}
