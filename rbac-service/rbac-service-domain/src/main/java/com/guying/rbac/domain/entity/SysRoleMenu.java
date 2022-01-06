package com.guying.rbac.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * sys_role_menu
 * @author CODE POTER
 */
@Data
public class SysRoleMenu implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

    /**
     * 创建人
     */
    private String crtBy;

    /**
     * 创建时间
     */
    private LocalDateTime crtTim;

    /**
     * 上一次更新人
     */
    private String lstUpdBy;

    /**
     * 上一次更新时间
     */
    private LocalDateTime lstUpdTim;

    private static final long serialVersionUID = 1L;
}