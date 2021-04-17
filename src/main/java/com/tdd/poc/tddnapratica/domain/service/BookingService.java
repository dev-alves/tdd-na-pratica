package com.tdd.poc.tddnapratica.domain.service;

import com.tdd.poc.tddnapratica.domain.model.BookingModel;
import com.tdd.poc.tddnapratica.domain.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public int daysCalculatorWithDatabase(String name) {
        BookingModel bookingModel = bookingRepository
                .findByReserveName(name)
                .orElseThrow(() -> new RuntimeException("Nao encontrou"));
        return Period.between(bookingModel.getCheckIn(), bookingModel.getCheckOut()).getDays();
    }


}
