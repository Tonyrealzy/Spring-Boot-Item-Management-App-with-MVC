package com.example.itemManagement.services;

import com.example.itemManagement.entity.Item;

import java.util.List;

public interface ItemService {
    public void createItem(String name, double price, String description);
    List<Item> getAllItems();
    public Item getOneItem(Long id);
    public void updateItem(Item item);
    public void deleteItemById(Long id);
}
