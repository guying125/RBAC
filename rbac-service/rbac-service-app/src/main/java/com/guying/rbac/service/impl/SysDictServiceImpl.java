/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.service.impl;

import com.guying.rbac.domain.domainservice.SysDictDomainService;
import com.guying.rbac.dto.DictRequest;
import com.guying.rbac.service.SysDictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：字典
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@Service
public class SysDictServiceImpl implements SysDictService {
    @Autowired
    private SysDictDomainService sysDictDomainService;

    @Override
    public boolean save(DictRequest dictRequest) {
        return false;
    }

    @Override
    public boolean delete(List<DictRequest> dictRequestList) {
        return false;
    }
}
