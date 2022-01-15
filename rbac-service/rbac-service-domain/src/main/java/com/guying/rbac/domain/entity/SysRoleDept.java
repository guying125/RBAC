package com.guying.rbac.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_role_dept
 *
 * @author CODE POTER
 */
@Accessors(chain = true)
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
     * 最近一次更新人（在更新时将该字段进行更新）
     */
    private String lstUpdBy;

    /**
     * 最近一次更新时间（在更新时将该字段进行更新）
     */
    private LocalDateTime lstUpdTim;

    private static final long serialVersionUID = 1L;
}