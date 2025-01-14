package com.simple.models.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Created by marathoner on 2021/07/16.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExampleDto {
    @Null
    private Long id;

    @NotNull
    private String content;

}
