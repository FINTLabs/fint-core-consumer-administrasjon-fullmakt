package no.fintlabs.consumer.model.fullmakt;

import no.fint.model.resource.administrasjon.fullmakt.FullmaktResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class FullmaktResponseKafkaConsumer extends EventResponseKafkaConsumer<FullmaktResource> {

    public FullmaktResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, FullmaktConfig fullmaktConfig, FullmaktLinker fullmaktLinker) {
        super(eventConsumerFactoryService, fullmaktConfig, fullmaktLinker);
    }

}
