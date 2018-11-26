package com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.cloud.producer;

import com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.entity.Item;
import com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: edward <br/>
 * Date: 11/25/18 10:11 PM <br/>
 */
@RestController
@EnableBinding(ProducerChannels.class)
public class ItemController {

    @Autowired
    private MessageChannel itemOutPutChannel;

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getItems(){
        return ResponseEntity.ok(itemService.getAllItem());
    }


    @PostMapping("/items")
    public ResponseEntity<Item> publishItem(@RequestBody Item item){

        Message<Item>  message = MessageBuilder
                    .withPayload(item)
                    .build();
        this.itemOutPutChannel.send(message);

        return ResponseEntity.ok(item);
    }
}
