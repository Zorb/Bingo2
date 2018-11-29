package com.cognizant.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.cognizant.bingo.account.domain.Prize;
import com.cognizant.bingo.account.domain.Ticket;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class AccountReceiver {

	private int ticketCount = 1;
	private int prizeCount = 1;
	
	MongoClient mongoClient = new MongoClient();
	MongoDatabase database = mongoClient.getDatabase("accounts");
	MongoCollection collection = database.getCollection("information");
//consume object & write to mongo
	
	
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
