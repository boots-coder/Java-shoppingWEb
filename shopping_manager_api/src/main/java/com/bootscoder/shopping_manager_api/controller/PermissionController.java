package com.bootscoder.shopping_manager_api.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bootscoder.shopping_common.pojo.Permission;
import com.bootscoder.shopping_common.result.BaseResult;
import com.bootscoder.shopping_common.service.PermissionService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 权限控制器
 *
 * @author bootsCoder
 * @date created on 2024/4/16
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {
    @DubboReference
    private PermissionService permissionService;

    /**
     * 新增权限
     * @param permission 权限对象
     * @return 执行结果
     */
    @PostMapping("/add")
    public BaseResult add(@RequestBody Permission permission){
        permissionService.add(permission);
        return BaseResult.ok();
    }

    /**
     * 修改权限
     * @param permission 权限对象
     * @return 执行结果
     */
    @PutMapping("/update")
    public BaseResult update(@RequestBody Permission permission){
        permissionService.update(permission);
        return BaseResult.ok();
    }

    /**
     * 删除权限
     * @param pid 权限id
     * @return 执行结果
     */
    @DeleteMapping("/delete")
    public BaseResult delete(Long pid){
        permissionService.delete(pid);
        return BaseResult.ok();
    }

    /**
     * 根据id查询权限
     * @param pid 权限id
     * @return 查询结果
     */
    @GetMapping("/findById")
    public BaseResult<Permission> findById(Long pid){
        Permission permission = permissionService.findById(pid);
        return BaseResult.ok(permission);
    }

    /**
     * 分页查询权限
     * @param page 页码
     * @param size 每页条数
     * @return 查询结果
     */
    @GetMapping("/search")
    public BaseResult<Page<Permission>> search(int page, int size){
        Page<Permission> page1 = permissionService.search(page, size);
        return BaseResult.ok(page1);
    }

    /**
     * 查询所有权限
     * @return 查询结果
     */
    @GetMapping("/findAll")
    public BaseResult<List<Permission>> findAll(){
        List<Permission> all = permissionService.findAll();
        return BaseResult.ok(all);
    }
}
