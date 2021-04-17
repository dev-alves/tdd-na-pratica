package com.tdd.poc.tddnapratica.api.controller;

import com.tdd.poc.tddnapratica.domain.model.BookingModel;
import com.tdd.poc.tddnapratica.domain.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/bookings")
@RestController
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;


    @GetMapping
    @ResponseBody
    public String getAll() {
        return "OK!";
    }

    @PostMapping
    public ResponseEntity<BookingModel> save(@RequestBody  BookingModel model) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookingRepository.save(model));
    }
}
