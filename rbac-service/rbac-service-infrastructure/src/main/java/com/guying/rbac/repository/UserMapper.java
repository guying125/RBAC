/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2022-01-04 00:04 星期二
 * ==============   ===============     =================================
 */
package com.guying.rbac.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guying.rbac.domain.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2022-01-04 00:04 星期二
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
