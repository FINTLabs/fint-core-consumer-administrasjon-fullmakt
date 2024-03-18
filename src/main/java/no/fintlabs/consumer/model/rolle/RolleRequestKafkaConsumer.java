package no.fintlabs.consumer.model.rolle;

import no.fint.model.resource.administrasjon.fullmakt.RolleResource;
import no.fintlabs.core.consumer.shared.resource.event.EventRequestKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class RolleRequestKafkaConsumer extends EventRequestKafkaConsumer<RolleResource> {
    public RolleRequestKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, RolleConfig rolleConfig) {
        super(eventConsumerFactoryService, rolleConfig);
    }
}
