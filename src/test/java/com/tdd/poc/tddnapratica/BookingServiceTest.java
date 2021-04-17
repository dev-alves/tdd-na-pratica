package com.tdd.poc.tddnapratica;

import com.tdd.poc.tddnapratica.domain.model.BookingModel;
import com.tdd.poc.tddnapratica.domain.service.BookingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@ExtendWith(SpringExtension.class)
public class BookingServiceTest {

    @TestConfiguration
    static class BookingServiceTestConfiguration {
        @Bean
        public BookingService bookingService() {
            return new BookingService();
        }
    }

    @Autowired
    BookingService bookingService;

    @BeforeEach
    public void setUp() {
        LocalDate checkIn = LocalDate.parse("2020-11-10");
        LocalDate checkOut = LocalDate.parse("2020-11-20");
//        BookingModel bookingModel
    }

    @Test
    public void bookingTestServiceDaysCalculator() {
        String name = "Michelli";
        int days = bookingService.daysCalculatorWithDatabase(name);
        Assertions.assertEquals(days, 10);
    }

}
