package project.springKafkaProducer.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {


    public NewTopic topic(){

        return  TopicBuilder.name("wikimedia_rcentechange").build();


    }


}