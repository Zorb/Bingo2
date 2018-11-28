package com.cognizant.bingo.prize.domain;

public class Prize {
    //    private Long id;
    private String prize;

    public Prize() {
    }

    public Prize(String prize) {
        this.prize = prize;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Prize{" +
//                "id=" + id +
                ", prize='" + prize + '\'' +
                '}';
    }
}
