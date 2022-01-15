/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service;

import com.alibaba.cola.dto.PageQuery;
import com.guying.rbac.dto.ConfigDTO;
import com.guying.rbac.dto.ConfigRequest;

import java.util.List;

/**
 * 描述：配置
 *
 * @author CODE POTER
 * @version 1.0
 */
public interface SysConfigService {
    boolean save(ConfigRequest configRequest);

    boolean delete(List<ConfigRequest> configRequestList);

    boolean update(ConfigRequest configRequest);

    List<ConfigDTO> findPage(PageQuery pageQuery);

    List<ConfigDTO> findByLabel(String label);
}
