package com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.service;

import com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.entity.Item;
import com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: edward <br/>
 * Date: 11/25/18 9:32 PM <br/>
 */

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item saveUpdateItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> getAllItem(){
        return itemRepository.findAll();
    }
}
