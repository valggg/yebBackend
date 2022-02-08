package com.alex.server.mapper;

import com.alex.server.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author alex
 * @since 2021-10-19
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询角色列表
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
