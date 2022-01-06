package com.guying.rbac.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_login_log
 *
 * @author CODE POTER
 */
@Data
public class SysLoginLog implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户号
     */
    private String usrId;

    /**
     * 登录状态（online：在线，登录初始状态，方便在线人数统计；login：退出登录后将online置为login；loginout：退出登录）
     */
    private String lgnSts;

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
     * 上一次更新人
     */
    private String lstUpdBy;

    /**
     * 上一次更新时间
     */
    private LocalDateTime lstUpdTim;

    private static final long serialVersionUID = 1L;
}