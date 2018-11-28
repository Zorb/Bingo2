package com.cognizant.bingo.account.receiver;

import com.cognizant.bingo.account.domain.Prize;
import com.cognizant.bingo.account.domain.Ticket;
import org.springframework.jms.annotation.JmsListener;

public class Receiver {
    private int ticketCount = 1;
    private int prizeCount = 1;

    @JmsListener(destination = "TicketQueue", containerFactory = "myFactory")
    public void receiveMessage(Ticket ticket) {
        String ticketMessage = "<" + ticketCount + "> Received1 <" + ticket + ">";
        System.out.println(ticketMessage);
        ticketCount++;
    }

    @JmsListener(destination = "PrizeQueue", containerFactory = "myFactory")
    public void receiveMessage(Prize prize) {
        String offerMessage = "<" + prizeCount + "> Received1 <" + prize + ">";
        System.out.println(offerMessage);
        prizeCount++;
    }
}


