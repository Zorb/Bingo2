package com.cognizant.bingo.ticket.service;

import com.cognizant.bingo.ticket.domain.Ticket;

import static com.cognizant.bingo.ticket.service.NumberConstants.SIX_NUM_DIGITS;

public class SixNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public Ticket generator() {
        return generateRandomAccountNumber(SIX_NUM_DIGITS);
    }
}
