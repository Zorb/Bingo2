package com.cognizant.bingo.ticket;

import com.cognizant.bingo.ticket.service.EightNumberGenerator;
import com.cognizant.bingo.ticket.service.SixNumberGenerator;
import com.cognizant.bingo.ticket.service.TenNumberGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "SixNumberGenerator")
    public SixNumberGenerator genSix(){
        return new SixNumberGenerator();
    }

    @Bean(name = "EightNumberGenerator")
    public EightNumberGenerator genEight(){
        return new EightNumberGenerator();
    }

    @Bean(name = "TenNumberGenerator")
    public TenNumberGenerator genTen(){
        return new TenNumberGenerator();
    }
}