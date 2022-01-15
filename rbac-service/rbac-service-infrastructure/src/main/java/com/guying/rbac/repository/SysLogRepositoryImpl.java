/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.repository;

import com.guying.rbac.domain.gateway.SysLogRepository;
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
public class SysLogRepositoryImpl implements SysLogRepository {
    @Autowired
    private SysOprLogMapper sysOprLogMapper;

    @Autowired
    private SysLoginLogMapper sysLoginLogMapper;

}
