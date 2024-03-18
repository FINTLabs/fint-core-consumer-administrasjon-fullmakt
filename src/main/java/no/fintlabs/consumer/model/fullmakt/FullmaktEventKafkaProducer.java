package no.fintlabs.consumer.model.fullmakt;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class FullmaktEventKafkaProducer extends EventKafkaProducer {
    public FullmaktEventKafkaProducer(EventProducerFactory eventProducerFactory, FullmaktConfig fullmaktConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, fullmaktConfig, eventTopicService);
    }
}
