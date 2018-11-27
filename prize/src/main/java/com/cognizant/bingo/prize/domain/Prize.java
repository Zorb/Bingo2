package com.cognizant.bingo.prize.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prize {
    @Id
    @GeneratedValue
    private Long Id;
    private String prize;

    public Prize() {}

    public Prize(String prize) {
        this.prize = prize;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }
}
