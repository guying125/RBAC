/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service;

import com.guying.rbac.dto.DeptRequest;

import java.util.List;

/**
 * 描述：机构
 *
 * @author CODE POTER
 * @version 1.0
 */
public interface SysDeptService {
    boolean save(DeptRequest deptRequest);

    boolean delete(List<DeptRequest> deptRequestList);
}
