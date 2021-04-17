package com.tdd.poc.tddnapratica.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class BookingModel {

    private Long id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer numberGuest;

}
