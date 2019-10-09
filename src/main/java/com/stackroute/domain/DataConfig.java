package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.stackroute")
public class DataConfig {

    @Bean(name = "actor1")
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
        actobj.setName("Raj");
        actobj.setAge(23);
        actobj.setGender("male");
        return actobj;
    }


}