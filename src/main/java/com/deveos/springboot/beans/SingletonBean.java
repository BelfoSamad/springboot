package com.deveos.springboot.beans;


import org.springframework.context.annotation.DependsOn;

//@Singleton(name = "ClientCountEJB")
//@Startup : bean initialized after the starting of the container
@DependsOn("parentEJB")//this bean will be initialized after the starting of parentEJB
public class SingletonBean {

    private int nb;

    public void incrementClientCount() {
        nb++;
    }

    public int getClientCount() {
        return nb;
    }
}
