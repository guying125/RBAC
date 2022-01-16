package com.guying.rbac.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_role
 *
 * @author CODE POTER
 */
@Accessors(chain = true)
@Data
public class SysRole implements Serializable {
    /**
     * 角色ID
     */
    private Long id;

    /**
     * 角色CODE
     */
    private String rolCode;

    /**
     * 角色名称
     */
    private String rolNam;

    /**
     * 备注
     */
    private String remark;

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

    /**
     * 是否删除（DELETED-已删除，NORMAL-正常）
     */
    private String delFlg;

    private static final long serialVersionUID = 1L;
}