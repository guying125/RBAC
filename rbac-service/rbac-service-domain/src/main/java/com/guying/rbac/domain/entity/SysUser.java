package com.guying.rbac.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_user
 *
 * @author CODE POTER
 */
@Accessors(chain = true)
@Data
public class SysUser implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户号
     */
    private String usrId;

    /**
     * 用户名
     */
    private String usrNam;

    /**
     * 用户昵称
     */
    private String usrNickNam;

    /**
     * 密码
     */
    private String usrPwd;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户状态（DISABLED-禁用，NORMAL-正常，DELETE-删除，LOCK-锁定）
     */
    private String usrSts;

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

    /**
     * 是否删除（DELETED-已删除，NORMAL-正常）
     */
    private String delFlg;

    /**
     * 用户头像
     */
    private byte[] usrAvatar;

    private static final long serialVersionUID = 1L;
}