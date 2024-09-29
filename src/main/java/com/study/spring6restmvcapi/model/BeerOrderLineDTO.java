package com.study.spring6restmvcapi.model;

import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class BeerOrderLineDTO {
    private UUID id;
    private Integer version;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @Min(value = 1, message = "Quantity must be more than 0")
    private Integer orderQuantity;
    private Integer quantityAllocated;
    private BeerDTO beer;
    private BeerOrderDTO beerOrder;
}
