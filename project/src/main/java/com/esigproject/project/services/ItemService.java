package com.esigproject.project.services;

import java.util.List;

import com.esigproject.project.model.Item;
import com.esigproject.project.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void save(Item item) {
        itemRepository.save(item);
    }

    public Item findById(long id) {
        return itemRepository.findById(id);
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public void deleteById(long id) {
        itemRepository.deleteById(id);
    }

}