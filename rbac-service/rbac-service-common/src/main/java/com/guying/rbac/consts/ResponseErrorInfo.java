/*
 * 修改说明：
 * ==============   ===============
 *      操作          用户
 * ==============   ===============
 *      新增          CODE POTER
 * ==============   ===============
 */
package com.guying.rbac.consts;

/**
 * 描述：响应错误提示
 *
 * @author CODE POTER
 * @version 1.0
 */
public enum ResponseErrorInfo {
    SAVE_SUCCESS("SUC0000", "保存成功"),
    UPDATE_SUCCESS("SUC0001", "更新成功"),
    DELETE_SUCCESS("SUC0002", "删除成功"),
    QUERY_SUCCESS("SUC0003", "初选成功"),

    SAVE_FAILURE("ERR1001", "保存失败"),
    SAVE_FAILURE2("ERR1002", "保存失败"),
    UPDATE_FAILURE("ERR1011", "更新失败"),
    UPDATE_FAILURE2("ERR1012", "更新失败"),
    DELETE_FAILURE("ERR1021", "删除失败"),
    DELETE_FAILURE2("ERR1022", "删除失败"),
    DELETE_REQUEST_EMPTY("ERR1023", "删除列表为空"),
    PAGE_QUERY("ERR1031", "分页查询失败"),

    ;

    private String code;
    private String message;

    ResponseErrorInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
