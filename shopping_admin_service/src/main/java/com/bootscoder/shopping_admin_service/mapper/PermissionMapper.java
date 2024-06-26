package com.bootscoder.shopping_admin_service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bootscoder.shopping_common.pojo.Permission;

public interface PermissionMapper extends BaseMapper<Permission> {
    /**
     * 删除角色_权限表中的相关数据
     * @param pid 权限id
     */
    void deletePermissionAllRole(Long pid);
}
