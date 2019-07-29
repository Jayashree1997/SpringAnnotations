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
        Movie m= context.getBean("movieBean",Movie.class);
        System.out.println(m);
        Actor a=context.getBean("actorBean",Actor.class);
        System.out.println(a);
        Movie m1=context.getBean("movieBean",Movie.class);
        System.out.println(m1);
        System.out.println(m==m1);
    }
}
