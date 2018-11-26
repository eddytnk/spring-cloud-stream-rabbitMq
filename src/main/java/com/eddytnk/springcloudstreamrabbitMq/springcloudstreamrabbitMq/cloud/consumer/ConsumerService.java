package com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.cloud.consumer;

import com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.entity.Item;
import com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * User: edward <br/>
 * Date: 11/25/18 10:49 PM <br/>
 */

@EnableBinding(ConsumerChannels.class)
public class ConsumerService {

    @Autowired
    private ItemService itemService;

    @StreamListener("itemInPutChannel")
    @SendTo("someOtherChannel")
    public Item handleMessage(Item item ) {
        Item savedItem = itemService.saveUpdateItem(item);
        return savedItem;
    }


}
