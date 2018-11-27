package com.cognizant.bingo.ticket.utils;

import java.util.HashSet;
import java.util.Set;

public class Validator {
    private static Set<String> accountNumbers = new HashSet<>();

    public static boolean validateAccountNumber(final String accNumber) {
        return !accountNumbers.add(accNumber);
    }
}
