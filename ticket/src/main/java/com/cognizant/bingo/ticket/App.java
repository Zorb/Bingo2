package com.cognizant.bingo.ticket;

import com.cognizant.bingo.ticket.service.IAccountGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        IAccountGenerator generatorSix = appConfig.genSix();
        IAccountGenerator generatorEight = appConfig.genEight();
        IAccountGenerator generatorTen = appConfig.genTen();

        System.out.println(generatorSix.generator());
        System.out.println(generatorEight.generator());
        System.out.println(generatorTen.generator());
    }
}
