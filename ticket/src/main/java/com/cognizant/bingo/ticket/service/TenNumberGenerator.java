package com.cognizant.bingo.ticket.service;

import com.cognizant.bingo.ticket.domain.Ticket;

import static com.cognizant.bingo.ticket.service.NumberConstants.TEN_NUM_DIGITS;

public class TenNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public Ticket generator() {
        return generateRandomAccountNumber(TEN_NUM_DIGITS);
    }
}
