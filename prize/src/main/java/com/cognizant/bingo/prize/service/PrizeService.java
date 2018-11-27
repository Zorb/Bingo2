package com.cognizant.bingo.prize.service;

import com.cognizant.bingo.prize.domain.Prize;
import org.springframework.stereotype.Service;

@Service
public class PrizeService {
    private static final int SIX_DIG_PRIZE = 25;
    private static final int EIGHT_DIG_PRIZE = 100;
    private static final int TEN_DIG_PRIZE = 400;

    public Prize checkPrize(final String ticketNumber) {
        Prize prize;

        final int multiplier = getPrizeMultiplier(ticketNumber);

        String value = "";
        switch (ticketNumber.length()) {
            case 6:
                value = String.valueOf(SIX_DIG_PRIZE * multiplier);
                break;
            case 8:
                value = String.valueOf(EIGHT_DIG_PRIZE * multiplier);
                break;
            case 10:
                value = String.valueOf(TEN_DIG_PRIZE * multiplier);
                break;
            default:
                // DO NOTHING
        }
        prize = new Prize(value);

        return prize;
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
