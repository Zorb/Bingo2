package com.cognizant.bingo.ticket.service;

import static com.cognizant.bingo.ticket.service.NumberConstants.SIX_NUM_DIGITS;

public class SixNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public String generator() {
        return generateRandomAccountNumber(SIX_NUM_DIGITS);
    }
}
