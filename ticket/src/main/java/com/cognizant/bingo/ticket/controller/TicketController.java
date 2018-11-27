package com.cognizant.bingo.ticket.controller;

import com.cognizant.bingo.ticket.domain.Ticket;
import com.cognizant.bingo.ticket.service.IAccountGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
public class TicketController {

    @Autowired
    IAccountGenerator ticketService;

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public Ticket generateTicket() {
        return ticketService.generator();
    }
}
