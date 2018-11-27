package com.cognizant.bingo.account.service;

import com.cognizant.bingo.account.domain.Account;
import com.cognizant.bingo.account.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository accountRepository;

    public String createAccount(Account account) {
        accountRepository.save(account);
        return "Account successfully created";
    }

    public Account retrieveAccount(Long accountId) {
        Optional<Account> accountDB = accountRepository.findById(accountId);
        return accountDB.get();
    }

    public String updateAccount(Long accountId, Account account) {
        Optional<Account> accountDB = accountRepository.findById(accountId);
        String res;

        if (!accountDB.isPresent())
            res = "Account does not exists";
        else {
            accountRepository.save(account);
            res = "Account successfully updated";
        }

        return res;
    }

    public String deleteAccount(Long accountId) {
        accountRepository.deleteById(accountId);
        return "Account successfully deleted";
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
