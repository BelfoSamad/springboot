package com.deveos.springboot.jpa.relations.many_to_many.m2o_newjoin;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class KeyElement implements Serializable {

    @ManyToOne
    private Element2 element2;
    @ManyToOne
    private Element1 element1;

}
