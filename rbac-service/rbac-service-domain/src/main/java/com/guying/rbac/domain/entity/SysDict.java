package com.guying.rbac.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_dict
 *
 * @author CODE POTER
 */
@Accessors(chain = true)
@Data
public class SysDict implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 数据值
     */
    private String value;

    /**
     * 标签名
     */
    private String labelNam;

    /**
     * 类型
     */
    private String type;

    /**
     * 描述
     */
    private String descInf;

    /**
     * 排序（升序）
     */
    private Long sort;

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
     * 备注信息
     */
    private String remarks;

    /**
     * 是否删除（DELETED-已删除，NORMAL-正常）
     */
    private String delFlg;

    private static final long serialVersionUID = 1L;
}