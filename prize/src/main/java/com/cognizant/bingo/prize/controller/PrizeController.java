package com.cognizant.bingo.prize.controller;

import com.cognizant.bingo.prize.domain.Prize;
import com.cognizant.bingo.prize.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.cognizant.bingo.prize.constant.PrizeUrl.URL_PRIZE;

@CrossOrigin
@RestController
public class PrizeController {

    @Autowired
    PrizeService prizeService;

    @GetMapping(URL_PRIZE)
    public Prize create(@PathVariable String ticketNumber) {
        return prizeService.prizeGenerator(ticketNumber);

    }
}
