package com.kdureidy.oneclick.web.rest;

import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TranslationResource {

    private static final Logger log = LoggerFactory.getLogger(TranslationResource.class);

    public TranslationResource() {}

    @GetMapping("/translate")
    @Timed
    public ResponseEntity<String> translate(String text, String source, String target) {
        log.debug("REST request to translate {} from language {} to language {}", text, source, target);
        return ResponseEntity.ok("Hello world - Mar7aba ya 3alam");
    }
}
