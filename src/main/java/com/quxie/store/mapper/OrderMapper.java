package com.quxie.store.mapper;

import com.quxie.store.entity.Order;
import com.quxie.store.entity.OrderItem;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/** 处理订单及订单商品数据的持久层接口 */
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param order 订单数据
     * @return 受影响的行数
     */
    Integer insertOrder(Order order);

    /**
     * 插入订单商品数据
     * @param orderItem 订单商品数据
     * @return 受影响的行数
     */
    Integer insertOrderItem(OrderItem orderItem);

    /**
     * 查询用户所有订单
     * @param uid 用户id
     * @return 订单列表
     */
    List<Order>findAllOrder(Integer uid);

    List<OrderItem>findAllOrderItem(Integer oid);

}
