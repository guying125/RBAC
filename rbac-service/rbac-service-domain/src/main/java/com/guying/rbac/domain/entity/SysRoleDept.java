package com.guying.rbac.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_role_dept
 *
 * @author CODE POTER
 */
@Data
public class SysRoleDept implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 机构ID
     */
    private Long deptId;

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