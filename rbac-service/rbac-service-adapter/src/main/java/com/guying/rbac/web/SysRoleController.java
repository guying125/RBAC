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
import com.guying.rbac.dto.MenuDTO;
import com.guying.rbac.dto.RoleDTO;
import com.guying.rbac.dto.RoleMenuRequest;
import com.guying.rbac.dto.RoleRequest;
import com.guying.rbac.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * 描述：角色
 *
 * @author CODE POTER
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("role")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @PostMapping("/save")
    public Response save(@RequestBody RoleRequest roleRequest) {
        log.info("角色——保存角色");

        return Response.buildSuccess();
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<RoleRequest> roleRequestList) {
        log.info("角色——删除角色");

        return Response.buildSuccess();
    }

    @PostMapping("/findPage")
    public MultiResponse<RoleDTO> findPage(@RequestBody PageQuery pageQuery) {
        log.info("角色——分页查询");

        return MultiResponse.of(Collections.emptyList());
    }

    @GetMapping("/findAll")
    public MultiResponse<RoleDTO> findAll() {
        log.info("角色——查询全部");

        return MultiResponse.of(Collections.emptyList());
    }

    /**
     * 查询角色菜单
     *
     * @param roleId 角色ID
     * @return 菜单对象集合列表
     */
    @GetMapping("/findRoleMenus")
    public MultiResponse<MenuDTO> findRoleMenus(@RequestParam("roleId") Long roleId) {
        log.info("角色——查询角色菜单");

        return MultiResponse.of(Collections.emptyList());
    }

    /**
     * 保存角色菜单
     *
     * @param roleMenuRequestList 角色菜单列表
     * @return 保存成功与否的结果
     */
    @PostMapping("/saveRoleMenus")
    public Response saveRoleMenus(@RequestBody List<RoleMenuRequest> roleMenuRequestList) {
        log.info("角色——保存角色菜单");

        return Response.buildSuccess();
    }
}
