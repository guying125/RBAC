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
import com.guying.rbac.dto.ConfigDTO;
import com.guying.rbac.dto.ConfigRequest;
import com.guying.rbac.service.SysConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * 描述：配置
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("config")
public class SysConfigController {
    @Autowired
    private SysConfigService sysConfigService;

    @PostMapping("/save")
    public Response save(@RequestBody ConfigRequest configRequest) {
        log.info("系统配置——保存系统配置");

        return Response.buildSuccess();
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<ConfigRequest> configRequestList) {
        log.info("系统配置——删除系统配置");

        return Response.buildSuccess();
    }

    @PostMapping("/update")
    public Response update(@RequestBody ConfigRequest configRequest) {
        log.info("系统配置——维护系统配置");

        return Response.buildSuccess();
    }

    @PostMapping("/findPage")
    public MultiResponse<ConfigDTO> findPage(@RequestBody PageQuery pageQuery) {
        log.info("系统配置——分页查询");

        return MultiResponse.of(Collections.emptyList());
    }

    @GetMapping("/findByLabel")
    public MultiResponse<ConfigDTO> findByLabel(@RequestParam("label") String label) {
        log.info("系统配置——根据标签查询");

        return MultiResponse.of(Collections.emptyList());
    }
}
