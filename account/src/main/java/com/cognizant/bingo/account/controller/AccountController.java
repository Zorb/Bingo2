package com.cognizant.bingo.account.controller;

import com.cognizant.bingo.account.constant.AccountUrl;
import com.cognizant.bingo.account.domain.Account;
import com.cognizant.bingo.account.domain.Prize;
import com.cognizant.bingo.account.domain.Ticket;
import com.cognizant.bingo.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.cognizant.bingo.account.constant.PrizeUrl.URL_PRIZE;
import static com.cognizant.bingo.account.constant.TicketUrl.URL_TICKET;

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

    @CrossOrigin
    @PostMapping(AccountUrl.URL_ACCOUNT)
    public Account send(@RequestBody Account account) {
        final Ticket ticket = restTemplate.getForObject(ticketURL + URL_TICKET, Ticket.class);

        account.setAccountNumber(ticket.getTicketNumber());
        return accountService.createAccount(account);
    }

    @CrossOrigin
    @GetMapping(AccountUrl.URL_ACCOUNT_ID_PRIZE)
    public String send(@PathVariable String id) {
        Account account = accountService.retrieveAccount(id);
        final Prize prize = restTemplate.getForObject(prizeURL + URL_PRIZE + id, Prize.class);

        account.setPrize(prize.getPrize());
        accountService.updateAccount(account.getAccountNumber(), account);
        return prize.getPrize();
    }

    @CrossOrigin
    @GetMapping(AccountUrl.URL_ACCOUNT)
    public List<Account> list() {
        return accountService.getAllAccounts();
    }

    @CrossOrigin
    @GetMapping(AccountUrl.URL_ACCOUNT_ID)
    public Account get(@PathVariable String id) {
        return accountService.retrieveAccount(id);
    }

    @CrossOrigin
    @PutMapping(AccountUrl.URL_ACCOUNT_ID)
    public String update(@PathVariable String id, @RequestBody Account account) {
        return accountService.updateAccount(id, account);
    }

    @CrossOrigin
    @DeleteMapping(AccountUrl.URL_ACCOUNT_ID)
    public String delete(@PathVariable String id) {
        return accountService.deleteAccount(id);
    }

}
