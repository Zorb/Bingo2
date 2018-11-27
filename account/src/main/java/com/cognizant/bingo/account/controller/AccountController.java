package com.cognizant.bingo.account.controller;

import com.cognizant.bingo.account.domain.Account;
import com.cognizant.bingo.account.domain.Prize;
import com.cognizant.bingo.account.domain.Ticket;
import com.cognizant.bingo.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private IAccountService accountService;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${url.ticket}")
    private String ticketURL;
    @Value("${url.prize}")
    private String prizeURL;

    @RequestMapping(value = "ticket", method = RequestMethod.GET)
    public void send() {
        Ticket ticket = restTemplate.getForObject(ticketURL + "/random", Ticket.class);
        Prize prize = restTemplate.getForObject(prizeURL + "/prize" + ticket.getTicketNumber(), Prize.class);

        System.out.println(ticket.getTicketNumber());
    }

    @RequestMapping(value = "accounts", method = RequestMethod.GET)
    public List<Account> list() {
        return accountService.getAllAccounts();
    }

    @RequestMapping(value = "accounts", method = RequestMethod.POST)
    public String create(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @RequestMapping(value = "accounts/{id}", method = RequestMethod.GET)
    public Account get(@PathVariable Long id) {
        return accountService.retrieveAccount(id);
    }

    @RequestMapping(value = "accounts/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable Long id, @RequestBody Account account) {
        return accountService.updateAccount(id, account);
    }

    @RequestMapping(value = "accounts/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id) {
        return accountService.deleteAccount(id);
    }

}
