package com.cognizant.bingo.ticket.service;

import com.cognizant.bingo.ticket.domain.Ticket;
import org.springframework.context.annotation.Primary;

import static com.cognizant.bingo.ticket.service.NumberConstants.EIGHT_NUM_DIGITS;

public class EightNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public Ticket generator() {
        return generateRandomAccountNumber(EIGHT_NUM_DIGITS);
    }
}
