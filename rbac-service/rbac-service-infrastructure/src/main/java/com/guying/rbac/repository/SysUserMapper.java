/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-06 01:06 星期四
 * ==============   ===============     =================================
 */
package com.guying.rbac.repository;

import com.guying.rbac.domain.user.entity.User;
import com.guying.rbac.domain.user.entity.User22;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2022-01-06 01:06 星期四
 */
@Mapper
public interface SysUserMapper {
    List<User22> select();
}
