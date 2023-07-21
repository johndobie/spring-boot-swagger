package com.johndobie.springboot.web.swagger;


import com.johndobie.springboot.web.model.EchoModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;


@Tag(name = "Echo Microservice", description = "This Microservice will echo the model passed in the response.")
public interface EchoControllerSwagger {

    @Operation(operationId = "EchoController", description = "This is a Description of this API call", summary = "This method will echo its request body")
    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EchoModel.class)))
    public EchoModel echoModel(@RequestBody @Valid EchoModel model);
}
