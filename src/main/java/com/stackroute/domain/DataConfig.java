package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    @Bean
    public Actor act_obj(){
        Actor act_obj = new Actor();
        act_obj.setName("Rajender");
        act_obj.setAge(22);
        act_obj.setGender("male");
        System.out.println("inside actor bean");
        return act_obj;
    }

    @Bean
    public Movie moviebean(){
        Movie movieBean = new Movie(act_obj());
        System.out.println("inside movie bean");
        return movieBean;
    }



}