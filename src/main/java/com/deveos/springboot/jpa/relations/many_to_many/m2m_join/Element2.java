package com.deveos.springboot.jpa.relations.many_to_many.m2m_join;

import javax.persistence.*;
import java.util.List;

@Entity
public class Element2 {

    @Id
    private Long id2;

    @ManyToMany
    //if mapping by default isn't working use JoinTable (Recommended)
    @JoinTable(name="relation_name",
            joinColumns=@JoinColumn(name="id2"),
            inverseJoinColumns=@JoinColumn(name="id1"))
    private List<Element1> elements1;
}
