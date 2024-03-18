package no.fintlabs.consumer.config;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class LinkMapper {

    public static Map<String, String> linkMapper() {
        return ImmutableMap.<String,String>builder()
            .put("no.fint.model.administrasjon.fullmakt.Fullmakt", "/administrasjon/fullmakt/fullmakt")
            .put("no.fint.model.administrasjon.fullmakt.Rolle", "/administrasjon/fullmakt/rolle")
            .build();
    }

}