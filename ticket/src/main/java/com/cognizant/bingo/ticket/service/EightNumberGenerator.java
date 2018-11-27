package com.cognizant.bingo.ticket.service;

import static com.cognizant.bingo.ticket.service.NumberConstants.EIGHT_NUM_DIGITS;

public class EightNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public String generator() {
        return generateRandomAccountNumber(EIGHT_NUM_DIGITS);
    }
}
