package com.kdureidy.oneclick.web.rest;

import com.kdureidy.oneclick.service.TranslationService;
import com.kdureidy.oneclick.web.rest.vm.TranslationResponse;
import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TranslationResource {

    private static final Logger log = LoggerFactory.getLogger(TranslationResource.class);

    private TranslationService translationService;

    public TranslationResource(TranslationService translationService) {
        this.translationService = translationService;
    }

    @GetMapping("/translate")
    @Timed
    public ResponseEntity<TranslationResponse> translate(@RequestParam("text") String text, @RequestParam("source") String source, @RequestParam("target") String target) {
        log.debug("REST request to translate {} from language {} to language {}", text, source, target);
        return ResponseEntity.ok(translationService.translate(text, source, target));
    }
}
