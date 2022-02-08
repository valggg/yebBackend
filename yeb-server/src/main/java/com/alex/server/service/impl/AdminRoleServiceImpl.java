package com.alex.server.service.impl;

import com.alex.server.mapper.AdminRoleMapper;
import com.alex.server.pojo.AdminRole;
import com.alex.server.service.IAdminRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员角色中间表 服务实现类
 * </p>
 *
 * @author alex
 * @since 2021-10-19
 */
@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {

}
