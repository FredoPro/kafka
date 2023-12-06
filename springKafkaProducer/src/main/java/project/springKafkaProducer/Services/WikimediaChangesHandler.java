package project.springKafkaProducer.Services;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
@Log4j2
@AllArgsConstructor
public class WikimediaChangesHandler implements EventHandler {

    private KafkaTemplate<String, String> kafkaTemplate;

    private String topic;



    @Override
    public void onOpen() throws Exception {

    }

    @Override
    public void onClosed() throws Exception {

    }

    @Override
    public void onMessage(String s, MessageEvent messageEvent) throws Exception {

        log.info(String.format("event data -> %s", messageEvent.getData()));

        kafkaTemplate.send(topic,messageEvent.getData());

    }

    @Override
    public void onComment(String s) throws Exception {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
