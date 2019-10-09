package com.stackroute;


import com.stackroute.domain.DataConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        Movie movie1 = context.getBean("moviebean", Movie.class);
        Movie movie2 = context.getBean("moviebean2", Movie.class);
        Movie movie3 = context.getBean("moviebean", Movie.class);

        System.out.println(movie1== movie2);
        System.out.println(movie1==movie3);
        System.out.println(movie2.toString());


    }

}