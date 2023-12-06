package project.springKafkaConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.springKafkaConsumer.entity.WikimediaData;
@Repository
public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}