package project.springKafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.springKafkaProducer.Services.WikimediaChangesProducer;

@SpringBootApplication
public class SpringKafkaProducerApplication implements CommandLineRunner {

	@Autowired
	private WikimediaChangesProducer wikimediaChangesProducer;

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		wikimediaChangesProducer.sendMessage();

	}
}
