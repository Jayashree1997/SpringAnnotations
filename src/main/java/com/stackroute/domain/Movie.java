package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

public class Movie {

    private Actor actor;

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
    @Autowired
    @Qualifier("actorBean")
    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
