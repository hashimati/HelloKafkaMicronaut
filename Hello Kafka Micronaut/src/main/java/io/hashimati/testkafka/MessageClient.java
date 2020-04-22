package io.hashimati.testkafka;

/**
 * @author Ahmed Al Hashmi. 
 */
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.messaging.annotation.Body;

@KafkaClient
public interface MessageClient {

    @Topic("messages")
    public void send(@Body Message message); 

}