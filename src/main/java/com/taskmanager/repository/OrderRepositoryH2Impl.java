package com.taskmanager.repository;

import com.taskmanager.dao.OrderDaoH2;
import com.taskmanager.entity.Order;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public class OrderRepositoryH2Impl implements Repository<Order> {

    private final OrderDaoH2 orderDaoH2;

    public OrderRepositoryH2Impl(OrderDaoH2 orderDaoH2) {
        this.orderDaoH2 = orderDaoH2;
    }

    @Override
    public List<Order> findAll() {
        return orderDaoH2.findAll();
    }

    @Override
    public Order findById(Long id) {
        return null;
    }

    @Override
    public Order create(Order order) {
        return orderDaoH2.save(order);
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public void delete(Order order) {

    }
}
