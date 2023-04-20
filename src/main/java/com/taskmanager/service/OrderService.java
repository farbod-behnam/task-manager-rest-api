package com.taskmanager.service;

import com.taskmanager.entity.Item;
import com.taskmanager.entity.Order;
import com.taskmanager.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final Repository<Order> orderRepository;
    private final Repository<Item> itemRepository;

    @Autowired
    public OrderService(Repository<Order> orderRepository, Repository<Item> itemRepository) {
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
    }

    public Order create(Order order) {

//        List<Item> items = new ArrayList<>();
//
//        for (Item item: order.getOrderedItems()) {
//            System.out.println("Item meal: " + item.getMeal());
//            items.add(itemRepository.create(item));
//        }
//
//        order.setOrderedItems(items);

        return orderRepository.create(order);
    }
}
