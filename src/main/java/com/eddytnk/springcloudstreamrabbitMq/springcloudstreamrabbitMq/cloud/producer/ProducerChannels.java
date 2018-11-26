package com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.cloud.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * User: edward <br/>
 * Date: 11/25/18 10:15 PM <br/>
 */
public interface ProducerChannels {

    @Output
    MessageChannel itemOutPutChannel();
}
