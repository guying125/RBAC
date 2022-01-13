/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2020-08-01 00:55 星期六
 * ==============   ===============     =================================
 */
package com.guying.rbac.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * 描述：权限封装
 *
 * @author CODE POTER
 * @version 1.0
 */
public class GrantedAuthorityImpl implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
