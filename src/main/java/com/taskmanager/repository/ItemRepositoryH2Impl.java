package com.taskmanager.repository;

import com.taskmanager.dao.ItemDaoH2;
import com.taskmanager.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public class ItemRepositoryH2Impl implements Repository<Item> {

    private final ItemDaoH2 itemDaoH2;

    @Autowired
    public ItemRepositoryH2Impl(ItemDaoH2 itemDaoH2) {
        this.itemDaoH2 = itemDaoH2;
    }

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(Long id) {
        return null;
    }

    @Override
    public Item create(Item item) {
        return itemDaoH2.save(item);
    }

    @Override
    public Item update(Item item) {
        return null;
    }

    @Override
    public void delete(Item item) {

    }
}
