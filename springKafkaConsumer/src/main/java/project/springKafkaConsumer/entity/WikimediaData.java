package project.springKafkaConsumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "wikimedia_recentchange")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WikimediaData {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Lob
        private String wikiEventData;

}
