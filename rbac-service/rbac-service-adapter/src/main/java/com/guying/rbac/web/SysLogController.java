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
import com.alibaba.cola.dto.PageQuery;
import com.alibaba.cola.dto.Response;
import com.guying.rbac.dto.LoginLogDTO;
import com.guying.rbac.dto.LoginLogRequest;
import com.guying.rbac.dto.OprLogDTO;
import com.guying.rbac.dto.OprLogRequest;
import com.guying.rbac.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * 描述：日志
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("log")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @PostMapping("/opr/delete")
    public Response oprLogDelete(@RequestBody List<OprLogRequest> oprLogRequestList) {
        log.info("操作日志——删除日志");

        return Response.buildSuccess();
    }

    @PostMapping("/opr/findPage")
    public MultiResponse<OprLogDTO> oprLogFindPage(@RequestBody PageQuery pageQuery) {
        log.info("操作日志——分页查询");

        return MultiResponse.of(Collections.emptyList());
    }

    @PostMapping("/login/delete")
    public Response loginLogDelete(@RequestBody List<LoginLogRequest> loginLogRequestList) {
        log.info("登录日志——删除登录日志");

        return Response.buildSuccess();
    }

    @PostMapping("/login/findPage")
    public MultiResponse<LoginLogDTO> loginLogFindPage(@RequestBody PageQuery pageQuery) {
        log.info("登录日志——分页查询");

        return MultiResponse.of(Collections.emptyList());
    }
}
