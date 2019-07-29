package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Movie movieBean()
    {
        Movie movie=new Movie();
        return movie;
    }
    @Bean
    public Actor actorBean()
    {
        Actor actor=new Actor();
        actor.setName("jayashree");
        actor.setGender("female");
        actor.setAge(22);

        return actor;
    }
}
