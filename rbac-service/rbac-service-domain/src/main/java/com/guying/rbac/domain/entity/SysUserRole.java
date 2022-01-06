package com.guying.rbac.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_user_role
 *
 * @author CODE POTER
 */
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
     * 上一次更新人
     */
    private String lstUpdBy;

    /**
     * 上一次更新时间
     */
    private LocalDateTime lstUpdTim;

    private static final long serialVersionUID = 1L;
}