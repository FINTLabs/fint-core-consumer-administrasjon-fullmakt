package no.fintlabs.consumer.model.fullmakt;

import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.fullmakt.FullmaktResource;
import no.fint.relations.FintRelationsMediaType;
import no.fintlabs.consumer.config.RestEndpoints;
import no.fintlabs.core.consumer.shared.resource.CacheService;
import no.fintlabs.core.consumer.shared.resource.WriteableConsumerRestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(name = "Fullmakt", value = RestEndpoints.FULLMAKT, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class FullmaktController extends WriteableConsumerRestController<FullmaktResource> {

    public FullmaktController(
            CacheService<FullmaktResource> cacheService,
            FullmaktLinker fintLinker,
            FullmaktConfig fullmaktConfig,
            FullmaktEventKafkaProducer fullmaktEventKafkaProducer,
            FullmaktResponseKafkaConsumer fullmaktResponseKafkaConsumer,
            FintFilterService odataFilterService,
            FullmaktRequestKafkaConsumer fullmaktRequestKafkaConsumer) {
        super(cacheService, fintLinker, fullmaktConfig, fullmaktEventKafkaProducer, fullmaktResponseKafkaConsumer, odataFilterService, fullmaktRequestKafkaConsumer);
    }
}
