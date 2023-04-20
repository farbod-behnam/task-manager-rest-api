package com.taskmanager.service;

import com.taskmanager.entity.Item;
import com.taskmanager.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final Repository<Item> itemRepository;

    @Autowired
    public ItemService(Repository<Item> itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item create(Item item) {
        return itemRepository.create(item);
    }
}
