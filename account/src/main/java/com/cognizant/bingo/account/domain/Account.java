package com.cognizant.bingo.account.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
    @Id
//    @GeneratedValue
//    private Long Id;
    private String accountNumber;
    private String firstName;
    private String lastName;
    private String prize;

    public Account() {
    }

    public Account(String accountNumber, String firstName, String lastName) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    public Long getId() {
//        return Id;
//    }

//    public void setId(Long id) {
//        Id = id;
//    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Account{" +
//                "Id=" + Id +
                ", accountNumber='" + accountNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", prize=" + prize +
                '}';
    }
}
