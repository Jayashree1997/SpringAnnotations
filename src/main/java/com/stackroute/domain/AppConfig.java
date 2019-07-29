package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "movieBean")
    public Movie movieBean()
    {
        Movie movie=new Movie();
        return movie;
    }

    @Bean(name = "movieBean1")
    public Movie movieBean1()
    {
        Movie movie1=new Movie();
        return movie1;
    }

    @Bean
    public Actor actorBean()
    {
        Actor actor=new Actor("sdaf","male",40);
        return actor;
    }
    @Bean
    public Actor actorBean1()
    {
        Actor actor1=new Actor("mansi","female",100);
        return actor1;
    }
    @Bean
    public Actor actorBean2()
    {
        Actor actor2=new Actor("xyz","male",20);
        return actor2;
    }
}
