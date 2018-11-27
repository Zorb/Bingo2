package com.cognizant.bingo.ticket.service;

import com.cognizant.bingo.ticket.domain.Ticket;
import com.cognizant.bingo.ticket.utils.Validator;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

class AccountNumberGenerator {
    Ticket generateRandomAccountNumber(final int length) {
        StringBuilder accNumber = new StringBuilder();
        Ticket ticket;

        do {
            Random random = new Random();
            int prefix = random.nextInt(3);
            switch (prefix) {
                case 0:
                    accNumber.append('A');
                    break;
                case 1:
                    accNumber.append('B');
                    break;
                case 2:
                    accNumber.append('C');
                    break;
                default:
                    // DO NOTHING
            }
            String suffix = RandomStringUtils.randomNumeric(length);
            accNumber.append(suffix);

        } while (Validator.validateAccountNumber(accNumber.toString()));
        ticket = new Ticket(accNumber.toString());

        return ticket;
    }
}
