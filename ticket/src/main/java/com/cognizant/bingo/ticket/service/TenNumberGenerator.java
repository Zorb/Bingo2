package com.cognizant.bingo.ticket.service;

import static com.cognizant.bingo.ticket.service.NumberConstants.TEN_NUM_DIGITS;

public class TenNumberGenerator extends AccountNumberGenerator implements IAccountGenerator {

    @Override
    public String generator() {
        return generateRandomAccountNumber(TEN_NUM_DIGITS);
    }
}
