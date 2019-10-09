package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfig {

    @Bean
    public Actor actobj(){
        Actor actobj = new Actor();
        actobj.setName("Rajender");
        actobj.setAge(22);
        actobj.setGender("male");
        return actobj;
    }

    @Bean
    public Actor act2(){
        Actor actobj = new Actor();
        actobj.setName("Santhosh");
        actobj.setAge(17);
        actobj.setGender("male");
        return actobj;
    }

    @Bean
    public Actor act3(){
        Actor actobj = new Actor();
        actobj.setName("raj");
        actobj.setAge(23);
        actobj.setGender("male");
        return actobj;
    }

    @Bean
    public Movie moviebean(){
        Movie movieBean = new Movie(actobj());
        return movieBean;
    }

    @Bean
    public Movie moviebean2(){
        Movie movieBean2 = new Movie(act3());
        return movieBean2;
    }


}