package no.fintlabs.consumer.model.fullmakt;

import no.fint.model.resource.administrasjon.fullmakt.FullmaktResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FullmaktRequestKafkaConsumer extends EventRequestKafkaConsumer<FullmaktResource> {
    public FullmaktRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FullmaktConfig fullmaktConfig) {
        super(eventConsumerFactoryService, fullmaktConfig);
    }
}
