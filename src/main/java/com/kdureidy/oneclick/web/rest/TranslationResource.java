package com.kdureidy.oneclick.web.rest;

import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TranslationResource {

    public TranslationResource() {}

    @GetMapping("/translate")
    @Timed
    public ResponseEntity<String> translate(String text, String source, String target) {
        log.debug("REST request to translate {} from language {} to language {}", text, source, target);
        return ResponseEntity.ok("Hello world - Mar7aba ya 3alam");
    }
}
