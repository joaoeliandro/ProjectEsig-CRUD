package com.esigproject.project.services;

import com.esigproject.project.model.Item;
import com.esigproject.project.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    
    @Autowired
    private ItemRepository itemRepository;
    
    public void save(Item item){
        itemRepository.save(item);
    }

}