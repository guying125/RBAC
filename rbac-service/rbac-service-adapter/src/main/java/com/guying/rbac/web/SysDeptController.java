/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.guying.rbac.dto.DeptDTO;
import com.guying.rbac.dto.DeptRequest;
import com.guying.rbac.service.SysDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * 描述：机构
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("dept")
public class SysDeptController {
    @Autowired
    private SysDeptService sysDeptService;

    @PostMapping("/save")
    public Response save(@RequestBody DeptRequest deptRequest) {
        log.info("机构——保存机构");

        return Response.buildSuccess();
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<DeptRequest> deptRequestList) {
        log.info("机构——删除机构");

        return Response.buildSuccess();
    }

    @PostMapping("/update")
    public Response update(@RequestBody DeptRequest deptRequest) {
        log.info("机构——维护机构");

        return Response.buildSuccess();
    }

    @GetMapping("/findTree")
    public MultiResponse<DeptDTO> findTree() {
        log.info("机构——查询机构树");

        return MultiResponse.of(Collections.emptyList());
    }
}
