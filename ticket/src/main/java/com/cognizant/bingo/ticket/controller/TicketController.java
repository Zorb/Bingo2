package com.cognizant.bingo.ticket.controller;

import com.cognizant.bingo.ticket.constant.TicketUrl;
import com.cognizant.bingo.ticket.domain.Ticket;
import com.cognizant.bingo.ticket.service.IAccountGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    IAccountGenerator ticketService;

    @GetMapping(TicketUrl.TICKET_URL)
    public Ticket generateTicket() {
        return ticketService.generator();
    }
}
