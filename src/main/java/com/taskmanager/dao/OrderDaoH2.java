package com.taskmanager.dao;

import com.taskmanager.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDaoH2 extends JpaRepository<Order, Long> {
}
