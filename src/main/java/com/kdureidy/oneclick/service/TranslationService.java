package com.kdureidy.oneclick.service;

import com.kdureidy.oneclick.web.rest.vm.TranslationResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class TranslationService {

    private final RestTemplate restTemplate;

    public TranslationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public TranslationResponse translate(String text, String from, String to) {

        if (from == null || from.isEmpty()) {
            from = "auto";
        }

        String url = "https://systran-systran-platform-for-language-processing-v1.p.rapidapi.com/translation/text/translate?source=" + from + "&target=" + to + "&input=" + text;

        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.add("x-rapidapi-key", "59d779886bmsh06622211265c07fp1a6fefjsna6c10ae293a7");
        httpHeaders.add("x-rapidapi-host", "systran-systran-platform-for-language-processing-v1.p.rapidapi.com");

        HttpEntity<?> entity = new HttpEntity<>(httpHeaders);
        HttpEntity<TranslationResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, TranslationResponse.class);
        return response.getBody();
    }
}
