package com.guying.rbac.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_opr_log
 *
 * @author CODE POTER
 */
@Accessors(chain = true)
@Data
public class SysOprLog implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户号
     */
    private String usrId;

    /**
     * 用户操作
     */
    private String usrOpr;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 执行时长（毫秒）
     */
    private Long executeTim;

    /**
     * IP地址
     */
    private String ipAddr;

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