package com.johndobie.springboot.web.controller;

import com.johndobie.springboot.web.model.EchoModel;
import com.johndobie.springboot.web.swagger.ErrorControllerSwagger;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@Validated
public class ErrorController implements ErrorControllerSwagger {
    public static final String RUNTIME_ERROR_ENDPOINT = "/error/runtime";


    @PostMapping(value = RUNTIME_ERROR_ENDPOINT)
    public String throwRuntimeError() {
        throw new RuntimeException("Runtime Error");
    }
}