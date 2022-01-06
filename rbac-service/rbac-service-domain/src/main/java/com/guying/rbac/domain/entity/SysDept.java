package com.guying.rbac.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_dept
 *
 * @author CODE POTER
 */
@Data
public class SysDept implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 机构号
     */
    private String deptNo;

    /**
     * 机构名称
     */
    private String deptNam;

    /**
     * 上一级机构ID（一级机构为0）
     */
    private Long parentId;

    /**
     * 排序
     */
    private Integer orderNum;

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

    /**
     * 是否删除（DELETED-已删除，NORMAL-正常）
     */
    private String delFlg;

    private static final long serialVersionUID = 1L;
}