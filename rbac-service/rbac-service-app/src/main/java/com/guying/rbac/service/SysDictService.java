/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service;

import com.guying.rbac.dto.DictRequest;

import java.util.List;

/**
 * 描述：字典
 *
 * @author CODE POTER
 * @version 1.0
 */
public interface SysDictService {
    boolean save(DictRequest dictRequest);

    boolean delete(List<DictRequest> dictRequestList);
}
