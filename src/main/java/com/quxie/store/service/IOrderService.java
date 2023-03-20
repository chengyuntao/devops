package com.quxie.store.service;

import com.quxie.store.entity.Order;
import com.quxie.store.entity.OrderItem;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/** 处理订单和订单数据的业务层接口 */
public interface IOrderService {
    /**
     * 创建订单
     * @param aid 收货地址的id
     * @param cids 即将购买的商品数据在购物车表中的id
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @return 成功创建的订单数据
     */
    Order create(Integer aid, Integer[] cids, Integer uid, String username);

    /**
     *
     * @param uid
     * @return 用户所有订单
     */
    List<Order>findAllOrders(Integer uid);

    List<OrderItem>findAllOrderItems(Integer oid);
}
