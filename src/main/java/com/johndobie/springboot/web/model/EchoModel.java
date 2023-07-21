package com.johndobie.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EchoModel {

    @Size(min = 1, max = 15)
    @NotNull
    private String name;

    @Size(min = 1, max = 30)
    @NotNull
    private String message;
}
