package com.johndobie.springboot.web.controller;

import com.johndobie.springboot.web.model.EchoModel;
import com.johndobie.springboot.web.swagger.EchoControllerSwagger;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;


@RestController
@Validated
public class EchoController implements EchoControllerSwagger {

    public static final String ECHO_MODEL_ENDPOINT = "/echo/model";

    @PostMapping(value = ECHO_MODEL_ENDPOINT)
    public EchoModel echoModel(@RequestBody @Valid EchoModel model) {
        return model;
    }
}