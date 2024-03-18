package no.fintlabs.consumer.model.rolle;

import no.fint.model.resource.administrasjon.fullmakt.RolleResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class RolleConfig extends ConsumerConfig<RolleResource> {

    public RolleConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "rolle";
    }
}
