package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Actor actobj;

    public Movie(Actor actobj) {
        this.actobj = actobj;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actorName=" + actobj.getName() +"\n"+"actorAge=" + actobj.getAge() +"\n"+ "actorGender=" + actobj.getGender() +
                '}';
    }


}

