package com.quxie.store.controller;

import com.quxie.store.entity.Order;
import com.quxie.store.entity.OrderItem;
import com.quxie.store.service.IOrderService;
import com.quxie.store.util.JsonResult;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController extends BaseController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("create")
    public JsonResult<Order> create(Integer aid, Integer[] cids, HttpSession session) {
        // 从Session中取出uid和username
        Integer uid = getUidFromSession(session);
        String username = getUsernameFromSession(session);
        // 调用业务对象执行业务
        Order data = orderService.create(aid, cids, uid, username);
        // 返回成功与数据
        return new JsonResult<Order>(OK, data);
    }

    @RequestMapping("createOrder")
    public JsonResult<Order>createOrder(Integer aid,Integer uid,String username,Integer[] cids){
        Order data = orderService.create(aid, cids, uid, username);
        return new JsonResult<Order>(OK, data);
    }

    @GetMapping("/list/{uid}")
    public JsonResult<List<Order>>findAllOrders(@PathVariable("uid") Integer uid){
        List<Order>orderList=orderService.findAllOrders(uid);
        return new JsonResult<List<Order>>(OK,orderList);
    }

    @GetMapping("item/{oid}")
    public JsonResult<List<OrderItem>>findAllOrderItems(@PathVariable("oid")Integer oid){
        List<OrderItem>orderItemList=orderService.findAllOrderItems(oid);
        return new JsonResult<List<OrderItem>>(OK,orderItemList);
    }

}
