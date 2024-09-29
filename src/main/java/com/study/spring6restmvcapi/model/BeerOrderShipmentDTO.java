package com.study.spring6restmvcapi.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class BeerOrderShipmentDTO {
    private UUID id;
    private Integer version;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @NotBlank
    private String trackingNumber;
}
