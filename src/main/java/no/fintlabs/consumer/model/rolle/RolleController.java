package no.fintlabs.consumer.model.rolle;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import no.fint.antlr.FintFilterService;
import no.fint.model.resource.administrasjon.fullmakt.FullmaktResource;
import no.fint.model.resource.administrasjon.fullmakt.RolleResource;
import no.fint.model.resource.administrasjon.organisasjon.ArbeidslokasjonResource;
import no.fint.relations.FintRelationsMediaType;
import no.fintlabs.consumer.config.RestEndpoints;
import no.fintlabs.core.consumer.shared.resource.CacheService;
import no.fintlabs.core.consumer.shared.resource.ConsumerRestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping(name = "Rolle", value = RestEndpoints.ROLLE, produces = {FintRelationsMediaType.APPLICATION_HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class RolleController extends ConsumerRestController<RolleResource> {

    public RolleController(
            CacheService<RolleResource> cacheService,
            RolleLinker fintLinker,
            FintFilterService odataFilterService) {
        super(cacheService, fintLinker, odataFilterService);
    }

    @PostConstruct
    private void registerIdentificators() {
        super.registerIdenficatorHandler("navn", RolleResource::getNavn);
    }
}
