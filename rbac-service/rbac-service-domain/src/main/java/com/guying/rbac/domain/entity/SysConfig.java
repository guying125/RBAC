package com.guying.rbac.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_config
 *
 * @author CODE POTER
 */
@Data
public class SysConfig implements Serializable {
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
     * 上一次更新人
     */
    private String lstUpdBy;

    /**
     * 上一次更新时间
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