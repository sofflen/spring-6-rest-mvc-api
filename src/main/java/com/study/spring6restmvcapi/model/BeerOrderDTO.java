package com.study.spring6restmvcapi.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class BeerOrderDTO {
    private UUID id;
    private Integer version;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String customerRef;
    private BigDecimal paymentAmount;
    private CustomerDTO customer;
    private BeerOrderShipmentDTO beerOrderShipment;
}
