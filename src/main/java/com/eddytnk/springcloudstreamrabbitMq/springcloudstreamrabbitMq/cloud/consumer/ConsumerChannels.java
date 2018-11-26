package com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.cloud.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * User: edward <br/>
 * Date: 11/25/18 10:15 PM <br/>
 */
public interface ConsumerChannels {

    @Input
    SubscribableChannel itemInPutChannel();
}
