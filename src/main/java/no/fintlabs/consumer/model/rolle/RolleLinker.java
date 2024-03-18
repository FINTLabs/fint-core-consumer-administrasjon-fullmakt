package no.fintlabs.consumer.model.rolle;

import no.fint.model.resource.administrasjon.fullmakt.RolleResource;
import no.fint.model.resource.administrasjon.fullmakt.RolleResources;
import no.fint.relations.FintLinker;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

@Component
public class RolleLinker extends FintLinker<RolleResource> {

    public RolleLinker() {
        super(RolleResource.class);
    }

    public void mapLinks(RolleResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public RolleResources toResources(Collection<RolleResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public RolleResources toResources(Stream<RolleResource> stream, int offset, int size, int totalItems) {
        RolleResources resources = new RolleResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(RolleResource resource) {
        return getAllSelfHrefs(resource).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(RolleResource resource) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(resource.getNavn()) && !StringUtils.isEmpty(resource.getNavn().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(resource.getNavn().getIdentifikatorverdi(), "navn"));
        }

        return builder.build();
    }

    int[] hashCodes(RolleResource resource) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(resource.getNavn()) && !StringUtils.isEmpty(resource.getNavn().getIdentifikatorverdi())) {
            builder.add(resource.getNavn().getIdentifikatorverdi().hashCode());
        }

        return builder.build().toArray();
    }
}