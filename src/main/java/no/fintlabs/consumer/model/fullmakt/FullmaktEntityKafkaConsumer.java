package no.fintlabs.consumer.model.fullmakt;

import no.fint.model.resource.administrasjon.fullmakt.FullmaktResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class FullmaktEntityKafkaConsumer extends EntityKafkaConsumer<FullmaktResource> {

    public FullmaktEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            FullmaktConfig fullmaktConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, fullmaktConfig);
    }
}
