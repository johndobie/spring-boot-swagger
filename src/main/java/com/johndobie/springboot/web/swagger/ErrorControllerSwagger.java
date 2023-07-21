package com.johndobie.springboot.web.swagger;


import com.johndobie.springboot.web.model.EchoModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Error Microservice", description = "This Microservice will throw different types of error to help with testing.")
public interface ErrorControllerSwagger {
    @Operation(operationId = "throwRuntimeError", description = "This is a Description of this API call", summary = "This method will echo its request body")
    public String throwRuntimeError();

}
