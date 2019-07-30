package com.stackroute.domain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext){
        this.applicationContext=applicationContext;
        System.out.println("this is application context block");
    }
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
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("this is beanfactory block");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("this is beanNameAware block"); }
}
