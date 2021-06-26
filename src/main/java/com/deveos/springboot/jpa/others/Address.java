package com.deveos.springboot.jpa.others;

import javax.persistence.Embeddable;
import java.io.Serializable;

//embaddable entities doesn't need an id and depends on other entities (used to provide more info)
@Embeddable
public class Address implements Serializable {

    private String rue;
    private int numero;
    private String codePostal;
    private String ville;

}
