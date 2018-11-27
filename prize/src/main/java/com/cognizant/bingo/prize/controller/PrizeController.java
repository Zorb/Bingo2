package com.cognizant.bingo.prize.controller;

import com.cognizant.bingo.prize.domain.Prize;
import com.cognizant.bingo.prize.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrizeController {

    @Autowired
    PrizeService prizeService;

    @RequestMapping(value = "/prize/{ticketNumber}", method = RequestMethod.GET)
    public Prize create(@PathVariable String ticketNumber) {
        return prizeService.checkPrize(ticketNumber);

    }
}
