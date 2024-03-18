package no.fintlabs.consumer.model.fullmakt;

import no.fint.model.resource.administrasjon.fullmakt.FullmaktResource;
import no.fintlabs.core.consumer.shared.config.ConsumerProps;
import no.fintlabs.core.consumer.shared.resource.ConsumerConfig;
import org.springframework.stereotype.Component;

@Component
public class FullmaktConfig extends ConsumerConfig<FullmaktResource> {

    public FullmaktConfig(ConsumerProps consumerProps) {
        super(consumerProps);
    }

    @Override
    protected String resourceName() {
        return "fullmakt";
    }
}
