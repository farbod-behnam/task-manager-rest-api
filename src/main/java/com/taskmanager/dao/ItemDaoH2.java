package com.taskmanager.dao;

import com.taskmanager.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDaoH2 extends JpaRepository<Item, Long> {
}
