package no.fintlabs.consumer.model.rolle;

import no.fint.model.resource.administrasjon.fullmakt.RolleResource;
import no.fintlabs.core.consumer.shared.resource.event.EventResponseKafkaConsumer;
import no.fintlabs.kafka.event.EventConsumerFactoryService;
import org.springframework.stereotype.Service;

@Service
public class RolleResponseKafkaConsumer extends EventResponseKafkaConsumer<RolleResource> {

    public RolleResponseKafkaConsumer(EventConsumerFactoryService eventConsumerFactoryService, RolleConfig rolleConfig, RolleLinker rolleLinker) {
        super(eventConsumerFactoryService, rolleConfig, rolleLinker);
    }

}
