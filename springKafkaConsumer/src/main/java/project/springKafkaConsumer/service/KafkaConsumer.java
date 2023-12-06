package project.springKafkaConsumer.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import project.springKafkaConsumer.entity.WikimediaData;
import project.springKafkaConsumer.repository.WikimediaDataRepository;

@Service
@Log4j2
public class KafkaConsumer {
    @Autowired
    private WikimediaDataRepository wikimediaDataRepository;


    @KafkaListener(topics = "wikimedia_recentchange",
                   groupId = "myGroup"                            )
    public void consume(String eventMessage){

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);
        wikimediaDataRepository.save(wikimediaData);
        log.info(String.format("Event message received -> %s", eventMessage));


    }


}
