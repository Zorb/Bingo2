package com.cognizant.bingo.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.bingo.account.domain.Account;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Long> {
}
