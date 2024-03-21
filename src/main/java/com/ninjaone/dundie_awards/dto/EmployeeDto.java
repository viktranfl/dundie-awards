package com.ninjaone.dundie_awards.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@Schema(description = "Details about the Employee")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeResponseDto implements Serializable {

    @JsonProperty("id")
    private long id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("dundieAwards")
    private Integer dundieAwards = 0;
}
