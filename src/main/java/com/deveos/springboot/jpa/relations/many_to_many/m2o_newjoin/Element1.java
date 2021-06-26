package com.deveos.springboot.jpa.relations.many_to_many.m2o_newjoin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Element1 {

    @Id
    private int id1;

    @OneToMany(mappedBy = "idAssoElement.element2")
    private Collection<AssociationElement> associationElements;

}
