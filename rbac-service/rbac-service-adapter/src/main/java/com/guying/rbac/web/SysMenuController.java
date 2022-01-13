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
import com.guying.rbac.dto.MenuDTO;
import com.guying.rbac.dto.MenuRequest;
import com.guying.rbac.service.SysMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

        return Response.buildSuccess();
    }

    @PostMapping("/delete")
    public Response delete(@RequestBody List<MenuRequest> menuRequestList) {
        log.info("菜单——删除菜单");

        return Response.buildSuccess();
    }

    @PostMapping("/update")
    public Response update(@RequestBody MenuRequest menuRequest) {
        log.info("菜单——维护菜单");

        return Response.buildSuccess();
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
