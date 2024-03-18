package no.fintlabs.consumer.config;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class LinkMapper {

    public static Map<String, String> linkMapper() {
        return ImmutableMap.<String,String>builder()
            .put("no.fint.model.administrasjon.personal.Arbeidsforhold", "/administrasjon/personal/arbeidsforhold")
            .put("no.fint.model.administrasjon.personal.Personalressurs", "/administrasjon/personal/personalressurs")
            .put("no.fint.model.administrasjon.personal.Variabellonn", "/administrasjon/personal/variabellonn")
            .put("no.fint.model.administrasjon.personal.Fravar", "/administrasjon/personal/fravar")
            .put("no.fint.model.administrasjon.personal.Fasttillegg", "/administrasjon/personal/fasttillegg")
            .put("no.fint.model.administrasjon.personal.Fastlonn", "/administrasjon/personal/fastlonn")
            .put("no.fint.model.administrasjon.personal.Personalmappe", "/administrasjon/personal/personalmappe")
            .put("no.fint.model.administrasjon.personal.Person", "/administrasjon/personal/person")
            .build();
    }

}