package com.guying.rbac.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * sys_menu
 *
 * @author CODE POTER
 */
@Accessors(chain = true)
@Data
public class SysMenu implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 菜单CODE
     */
    private String menuCode;

    /**
     * 菜单名称
     */
    private String menuNam;

    /**
     * 父级菜单ID（一级菜单为0）
     */
    private Long parentId;

    /**
     * 菜单URL（类型：1.普通页面，2.嵌套完整外部页面，3.嵌套服务器页面）
     */
    private String url;

    /**
     * 菜单权限，授权（多个用半角逗号分隔）
     */
    private String menuPerms;

    /**
     * 类型
     */
    private String menuTyp;

    /**
     * 菜单图标
     */
    private String menuIcon;

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