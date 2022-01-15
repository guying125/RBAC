/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service.impl;

import com.guying.rbac.domain.domainservice.SysDeptDomainService;
import com.guying.rbac.dto.DeptRequest;
import com.guying.rbac.service.SysDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：机构
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Service
public class SysDeptServiceImpl implements SysDeptService {
    @Autowired
    private SysDeptDomainService sysDeptDomainService;

    @Override
    public boolean save(DeptRequest deptRequest) {
        return false;
    }

    @Override
    public boolean delete(List<DeptRequest> deptRequestList) {
        return false;
    }
}
