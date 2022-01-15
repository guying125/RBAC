/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service;

import com.guying.rbac.dto.RoleRequest;

import java.util.List;

/**
 * 描述：角色
 *
 * @author CODE POTER
 * @version 1.0
 */
public interface SysRoleService {
    boolean save(RoleRequest roleRequest);

    boolean delete(List<RoleRequest> roleRequestList);
}
