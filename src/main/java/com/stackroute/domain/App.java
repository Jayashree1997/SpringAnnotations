package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie m= context.getBean(Movie.class);
        System.out.println(m);
        Actor a=context.getBean(Actor.class);
        System.out.println(a);

    }
}
