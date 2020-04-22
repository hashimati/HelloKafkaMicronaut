package io.hashimati.testkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author Ahmed Al Hashmi. 
 */
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.messaging.annotation.Body;
@KafkaListener(groupId = "me")
public class MessageListener {
    private static final Logger LOGGER= LoggerFactory.getLogger(MessageListener.class); 
    @Topic("messages")
    public void receive(@Body Message message)
    {
        LOGGER.info("Received {}", message);
    }
}