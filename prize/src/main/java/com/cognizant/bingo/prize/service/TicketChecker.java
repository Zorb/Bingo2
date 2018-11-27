package com.cognizant.bingo.prize.service;

public class TicketChecker {
    private static final int SIX_DIG_PRIZE = 25;
    private static final int EIGHT_DIG_PRIZE = 100;
    private static final int TEN_DIG_PRIZE = 400;

    public String checkPrize(final String ticket) {
        int prize = 0;

        final int multiplier = getPrizeMultiplier(ticket);

        switch (ticket.length()) {
            case 6:
                prize = SIX_DIG_PRIZE * multiplier;
                break;
            case 8:
                prize = EIGHT_DIG_PRIZE * multiplier;
                break;
            case 10:
                prize = TEN_DIG_PRIZE * multiplier;
                break;
            default:
                // DO NOTHING
        }

        return String.valueOf(prize);
    }

    private int getPrizeMultiplier(String ticket) {
        int multiplier = 0;

        switch (ticket.charAt(0)) {
            case 'A':
                multiplier = 2;
                break;
            case 'B':
                multiplier = 1;
                break;
            default:
                // DO NOTHING
        }

        return multiplier;
    }
}
