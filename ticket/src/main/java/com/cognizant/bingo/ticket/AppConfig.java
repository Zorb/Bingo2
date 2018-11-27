package com.cognizant.bingo.ticket;

import com.cognizant.bingo.ticket.service.EightNumberGenerator;
import com.cognizant.bingo.ticket.service.SixNumberGenerator;
import com.cognizant.bingo.ticket.service.TenNumberGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean(name = "SixNumberGenerator")
    public SixNumberGenerator genSix(){
        return new SixNumberGenerator();
    }

    @Bean(name = "EightNumberGenerator")
    @Primary
    public EightNumberGenerator genEight(){
        return new EightNumberGenerator();
    }

    @Bean(name = "TenNumberGenerator")
    public TenNumberGenerator genTen(){
        return new TenNumberGenerator();
    }
}