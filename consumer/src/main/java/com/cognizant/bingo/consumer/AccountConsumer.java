package com.cognizant.bingo.consumer;

import com.cognizant.bingo.domain.Prize;
import com.cognizant.bingo.domain.Ticket;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AccountConsumer {

    private int ticketCount = 1;
    private int prizeCount = 1;

//	MongoClient mongoClient = new MongoClient();
//	MongoDatabase database = mongoClient.getDatabase("accounts");
//	MongoCollection<Account> collection = database.getCollection("information");

    @JmsListener(destination = "TicketQueue", containerFactory = "myFactory")
    public void receiveMessage(Ticket ticket) {
        String ticketMessage = "<" + ticketCount + "> Received1 <" + ticket + ">";
        System.out.println(ticketMessage);
        ticketCount++;
    }

    @JmsListener(destination = "PrizeQueue", containerFactory = "myFactory")
    public void receiveMessage(Prize prize) {
        String prizeMessage = "<" + prizeCount + "> Received1 <" + prize + ">";
        System.out.println(prizeMessage);
        prizeCount++;
    }
}
