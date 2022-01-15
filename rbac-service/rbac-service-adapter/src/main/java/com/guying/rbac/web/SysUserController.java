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
import com.alibaba.cola.dto.SingleResponse;
import com.guying.rbac.consts.ResponseErrorInfo;
import com.guying.rbac.domain.entity.SysUser;
import com.guying.rbac.dto.PermissionDTO;
import com.guying.rbac.dto.RoleDTO;
import com.guying.rbac.dto.UserDTO;
import com.guying.rbac.dto.UserRequest;
import com.guying.rbac.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * 描述：用户控制器
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/findAll")
    public MultiResponse<SysUser> findAll() {
        log.info("查询所有用户");
        return MultiResponse.of(sysUserService.findAll());
    }

    @PostMapping("/save")
    public Response save(@RequestBody UserRequest userRequest) {
        log.info("用户——保存用户");
        try {
            boolean success = sysUserService.save(userRequest);
            if (success) {
                log.info("用户——保存用户-成功");
                return Response.buildSuccess();
            } else {
                log.error("用户——保存用户-失败");
                return Response.buildFailure(ResponseErrorInfo.SAVE_FAILURE.getCode(),
                                             ResponseErrorInfo.SAVE_FAILURE.getMessage());
            }
        } catch (Exception ex) {
            log.error("用户——保存用户-失败");
            return Response.buildFailure(ResponseErrorInfo.SAVE_FAILURE2.getCode(),
                                         ResponseErrorInfo.SAVE_FAILURE2.getMessage());
        }
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<UserRequest> userRequestList) {
        log.info("用户——删除用户");
        if (CollectionUtils.isEmpty(userRequestList)) {
            log.error("列表为空");
            return Response.buildFailure(ResponseErrorInfo.DELETE_REQUEST_EMPTY.getCode(),
                                         ResponseErrorInfo.DELETE_REQUEST_EMPTY.getMessage());
        }
        try {
            boolean success = sysUserService.delete(userRequestList);
            if (success) {
                log.info("用户——删除用户-成功");
                return Response.buildSuccess();
            } else {
                log.error("用户——删除用户-失败");
                return Response.buildFailure(ResponseErrorInfo.DELETE_FAILURE.getCode(),
                                             ResponseErrorInfo.DELETE_FAILURE.getMessage());
            }
        } catch (Exception ex) {
            log.error("用户——删除用户-失败");
            return Response.buildFailure(ResponseErrorInfo.DELETE_FAILURE2.getCode(),
                                         ResponseErrorInfo.DELETE_FAILURE2.getMessage());
        }
    }

    @PostMapping("/findPage")
    public MultiResponse<UserDTO> findPage(@RequestBody PageQuery pageQuery) {
        log.info("用户——分页查询");

        return MultiResponse.of(Collections.emptyList());
    }

    @GetMapping("/findByName")
    public SingleResponse<UserDTO> findByName(@RequestParam("name") String name) {
        log.info("用户——根据名称查询");

        return SingleResponse.of(new UserDTO());
    }

    @GetMapping("/findPermissions")
    public MultiResponse<PermissionDTO> findPermissions(@RequestParam Long userId) {
        log.info("用户——查询用户权限(根据用户号)");

        return MultiResponse.of(Collections.emptyList());
    }

    @GetMapping("/findUserRoles")
    public MultiResponse<RoleDTO> findUserRoles(@RequestParam Long userId) {
        log.info("用户——查询用户角色(根据用户号)");

        return MultiResponse.of(Collections.emptyList());
    }

    @PostMapping(value = "/exportExcelUser")
    public void exportExcelUser(@RequestBody UserRequest userRequest) {
        log.info("用户——导出为Excel文件");
    }
}
