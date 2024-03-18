package no.fintlabs.consumer.model.rolle;

import no.fint.model.resource.administrasjon.fullmakt.RolleResource;
import no.fintlabs.core.consumer.shared.resource.kafka.EntityKafkaConsumer;
import no.fintlabs.kafka.common.ListenerBeanRegistrationService;
import no.fintlabs.kafka.entity.EntityConsumerFactoryService;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.stereotype.Service;

@Service
public class RolleEntityKafkaConsumer extends EntityKafkaConsumer<RolleResource> {

    public RolleEntityKafkaConsumer(
            EntityConsumerFactoryService entityConsumerFactoryService,
            ListenerBeanRegistrationService listenerBeanRegistrationService,
            EntityTopicService entityTopicService,
            RolleConfig rolleConfig) {
        super(entityConsumerFactoryService, listenerBeanRegistrationService, entityTopicService, rolleConfig);
    }
}
