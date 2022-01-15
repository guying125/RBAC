package com.guying.rbac.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_user_role
 *
 * @author CODE POTER
 */
@Accessors(chain = true)
@Data
public class SysUserRole implements Serializable {
    /**
     * 用户角色ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long usrId;

    /**
     * 角色ID
     */
    private Long roleId;

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