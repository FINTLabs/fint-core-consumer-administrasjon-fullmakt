package no.fintlabs.consumer.model.rolle;

import no.fintlabs.core.consumer.shared.resource.kafka.EventKafkaProducer;
import no.fintlabs.kafka.event.EventProducerFactory;
import no.fintlabs.kafka.event.topic.EventTopicService;
import org.springframework.stereotype.Service;

@Service
public class RolleEventKafkaProducer extends EventKafkaProducer {
    public RolleEventKafkaProducer(EventProducerFactory eventProducerFactory, RolleConfig rolleConfig, EventTopicService eventTopicService) {
        super(eventProducerFactory, rolleConfig, eventTopicService);
    }
}
