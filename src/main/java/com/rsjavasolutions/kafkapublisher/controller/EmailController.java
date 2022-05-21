package com.rsjavasolutions.kafkapublisher.controller;

import com.rsjavasolutions.kafkapublisher.model.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("emails")
@RequiredArgsConstructor
public class EmailController {

    @Autowired
    private KafkaTemplate<String, Object> template;

    private static final String EMAIL_TOPIC = "email";

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void sendObjectMessage(@RequestBody @Valid Email email) {
        template.send(EMAIL_TOPIC, email);

        log.info("Email object published: {}", email);
    }
}
