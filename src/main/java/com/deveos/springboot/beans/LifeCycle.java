package com.deveos.springboot.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycle {

    @PostConstruct
    public void PostConstruct(){
        //stateless, stateful, singleton
        //after creation

        //container calls all di then calls PostConstruct if existed
    }

    //@PrePassivate
    public void PrePassivate(){
        //stateful
        //before passivation
    }

    //@PostActivate
    public void PostActivate(){
        //stateful
        //after it's activated
    }

    @PreDestroy
    public void PreDestroy(){
        //stateless, stateful, singleton
        //before destroying

        //stateful bean is deleted after the client call a method annotated with @Remove

        //at the end of the lifecycle container calls this method if existed
    }
}
