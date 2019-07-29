package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Movie {

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

//    public Actor getActor() {
//        return actor;
//    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
@Autowired
    private Actor actor;
//    public Movie(Actor actor){
//        this.actor=actor;
//    }


}
