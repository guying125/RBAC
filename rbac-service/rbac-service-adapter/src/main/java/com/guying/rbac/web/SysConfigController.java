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
import com.guying.rbac.consts.ResponseErrorInfo;
import com.guying.rbac.dto.ConfigDTO;
import com.guying.rbac.dto.ConfigRequest;
import com.guying.rbac.service.SysConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
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
        try {
            boolean success = sysConfigService.save(configRequest);
            if (success) {
                log.info("系统配置——保存系统配置-成功");
                return Response.buildSuccess();
            } else {
                log.error("系统配置——保存系统配置-失败");
                return Response.buildFailure(ResponseErrorInfo.SAVE_FAILURE.getCode(),
                                             ResponseErrorInfo.SAVE_FAILURE.getMessage());
            }
        } catch (Exception ex) {
            log.error("系统配置——保存系统配置-失败");
            return Response.buildFailure(ResponseErrorInfo.SAVE_FAILURE2.getCode(),
                                         ResponseErrorInfo.SAVE_FAILURE2.getMessage());
        }
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<ConfigRequest> configRequestList) {
        log.info("系统配置——删除系统配置");
        if (CollectionUtils.isEmpty(configRequestList)) {
            log.error("列表为空");
            return Response.buildFailure(ResponseErrorInfo.DELETE_REQUEST_EMPTY.getCode(),
                                         ResponseErrorInfo.DELETE_REQUEST_EMPTY.getMessage());
        }
        try {
            boolean success = sysConfigService.delete(configRequestList);
            if (success) {
                log.info("系统配置——删除系统配置-成功");
                return Response.buildSuccess();
            } else {
                log.error("系统配置——删除系统配置-失败");
                return Response.buildFailure(ResponseErrorInfo.DELETE_FAILURE.getCode(),
                                             ResponseErrorInfo.DELETE_FAILURE.getMessage());
            }
        } catch (Exception ex) {
            log.error("系统配置——删除系统配置-失败");
            return Response.buildFailure(ResponseErrorInfo.DELETE_FAILURE2.getCode(),
                                         ResponseErrorInfo.DELETE_FAILURE2.getMessage());
        }
    }

    @PostMapping("/findPage")
    public MultiResponse<ConfigDTO> findPage(@RequestBody PageQuery pageQuery) {
        log.info("系统配置——分页查询");

        try {
            List<ConfigDTO> configDTOList = sysConfigService.findPage(pageQuery);
            if (!CollectionUtils.isEmpty(configDTOList)) {
                log.info("系统配置——分页查询-成功");
                return MultiResponse.of(configDTOList);
            } else {
                log.warn("系统配置——分页查询-为空");
                return MultiResponse.of(Collections.emptyList());
            }
        } catch (Exception ex) {
            log.error("系统配置——分页查询-失败");
            return MultiResponse.buildFailure(ResponseErrorInfo.PAGE_QUERY.getCode(),
                                              ResponseErrorInfo.PAGE_QUERY.getMessage());
        }
    }

    @GetMapping("/findByLabel")
    public MultiResponse<ConfigDTO> findByLabel(@RequestParam("label") String label) {
        log.info("系统配置——根据标签查询");

        try {
            List<ConfigDTO> configDTOList = sysConfigService.findByLabel(label);
            if (!CollectionUtils.isEmpty(configDTOList)) {
                log.info("系统配置——根据标签查询-成功");
                return MultiResponse.of(configDTOList);
            } else {
                log.warn("系统配置——根据标签查询-为空");
                return MultiResponse.of(Collections.emptyList());
            }
        } catch (Exception ex) {
            log.error("系统配置——根据标签查询-失败");
            return MultiResponse.buildFailure(ResponseErrorInfo.PAGE_QUERY.getCode(),
                                              ResponseErrorInfo.PAGE_QUERY.getMessage());
        }
    }
}
