package com.bootscoder.shopping_common.service;

import com.bootscoder.shopping_common.pojo.Orders;

import java.util.List;

/**
 * 订单
 */
public interface OrdersService {
    // 生成订单
    Orders add(Orders orders);
    // 修改订单
    void update(Orders orders);
    // 根据id查询订单
    Orders findById(String id);
    // 查询用户的订单
    List<Orders> findUserOrders(Long userId, Integer status);
}
