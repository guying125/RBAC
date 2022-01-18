/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 描述：配置
 *
 * @author CODE POTER
 * @version 1.0
 */
@Accessors(chain = true)
@Data
public class ConfigRequest extends DTO {
    /**
     * ID
     */
    private String id;

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
}
