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
import com.guying.rbac.consts.ResponseErrorInfo;
import com.guying.rbac.dto.MenuDTO;
import com.guying.rbac.dto.MenuRequest;
import com.guying.rbac.service.SysMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * 描述：菜单
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("menu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @PostMapping("/save")
    public Response save(@RequestBody MenuRequest menuRequest) {
        log.info("菜单——保存菜单");
        try {
            boolean success = sysMenuService.save(menuRequest);
            if (success) {
                log.info("菜单——保存菜单-成功");
                return Response.buildSuccess();
            } else {
                log.error("菜单——保存菜单-失败");
                return Response.buildFailure(ResponseErrorInfo.SAVE_FAILURE.getCode(),
                                             ResponseErrorInfo.SAVE_FAILURE.getMessage());
            }
        } catch (Exception ex) {
            log.error("菜单——保存菜单-失败");
            return Response.buildFailure(ResponseErrorInfo.SAVE_FAILURE2.getCode(),
                                         ResponseErrorInfo.SAVE_FAILURE2.getMessage());
        }
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<MenuRequest> menuRequestList) {
        log.info("菜单——删除菜单");
        if (CollectionUtils.isEmpty(menuRequestList)) {
            log.error("列表为空");
            return Response.buildFailure(ResponseErrorInfo.DELETE_REQUEST_EMPTY.getCode(),
                                         ResponseErrorInfo.DELETE_REQUEST_EMPTY.getMessage());
        }
        try {
            boolean success = sysMenuService.delete(menuRequestList);
            if (success) {
                log.info("菜单——删除菜单-成功");
                return Response.buildSuccess();
            } else {
                log.error("菜单——删除菜单-失败");
                return Response.buildFailure(ResponseErrorInfo.DELETE_FAILURE.getCode(),
                                             ResponseErrorInfo.DELETE_FAILURE.getMessage());
            }
        } catch (Exception ex) {
            log.error("菜单——删除菜单-失败");
            return Response.buildFailure(ResponseErrorInfo.DELETE_FAILURE2.getCode(),
                                         ResponseErrorInfo.DELETE_FAILURE2.getMessage());
        }
    }

    @GetMapping("/findNavTree")
    public MultiResponse<MenuDTO> findNavTree(@RequestParam("userName") String userName) {
        log.info("菜单——查询导航菜单树");

        return MultiResponse.of(Collections.emptyList());
    }

    @GetMapping("/findMenuTree")
    public MultiResponse<MenuDTO> findMenuTree(@RequestParam("userName") String userName,
                                               @RequestParam("menuType") int menuType) {
        log.info("菜单——查询菜单树");

        return MultiResponse.of(Collections.emptyList());
    }
}
