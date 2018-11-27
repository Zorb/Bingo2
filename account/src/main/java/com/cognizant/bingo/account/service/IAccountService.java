package com.cognizant.bingo.account.service;

import com.cognizant.bingo.account.domain.Account;

import java.util.List;

public interface IAccountService {
    String createAccount(Account account);

    Account retrieveAccount(Long accountId);

    String updateAccount(Long accountId, Account account);

    String deleteAccount(Long accountId);

    List<Account> getAllAccounts();
}
