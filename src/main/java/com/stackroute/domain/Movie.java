package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    @Qualifier("actor1")
    private Actor actobj;



    @Override
    public String toString() {
        return "Movie{" +
                "actorName=" + actobj.getName() +"\n"+"actorAge=" + actobj.getAge() +"\n"+ "actorGender=" + actobj.getGender() +
                '}';
    }
}
