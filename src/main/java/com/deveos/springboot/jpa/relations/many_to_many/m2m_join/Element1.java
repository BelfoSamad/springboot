package com.deveos.springboot.jpa.relations.many_to_many.m2m_join;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Element1 {

    @Id
    private Long id1;

    //should set mappedby
    @ManyToMany(mappedBy = "elements1")
    private List<Element2> elements2;

}
