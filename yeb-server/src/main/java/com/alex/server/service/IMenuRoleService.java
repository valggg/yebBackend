package com.alex.server.service;

import com.alex.server.pojo.MenuRole;
import com.alex.server.pojo.RespBean;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 菜单角色中间表 服务类
 * </p>
 *
 * @author alex
 * @since 2021-10-19
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
