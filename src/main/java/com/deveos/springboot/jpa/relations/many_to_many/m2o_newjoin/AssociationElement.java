package com.deveos.springboot.jpa.relations.many_to_many.m2o_newjoin;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

//is the association class between clients and products, here we add more infos about the m2m relation
@Entity
public class AssociationElement {

    @EmbeddedId
    private KeyElement idAssoElement;

    //Other Data

}
