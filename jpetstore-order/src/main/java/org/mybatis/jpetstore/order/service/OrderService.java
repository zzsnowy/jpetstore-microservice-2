package org.mybatis.jpetstore.order.service;

import java.util.List;
import org.mybatis.jpetstore.domain.Order;
public interface OrderService {

    // 插入订单，生成新订单
    public void insertOrder(Order order);

    // 取得订单
    public Order getOrder(int orderId);

    // 通过用户名查看订单
    public List<Order> getOrdersByUsername(String username);

    // 生成订单序列
    public int getNextId(String name) ;
}
