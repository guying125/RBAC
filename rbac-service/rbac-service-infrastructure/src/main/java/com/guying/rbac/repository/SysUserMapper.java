package com.guying.rbac.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guying.rbac.domain.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author CODE POTER
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}