package com.deveos.springboot.jpa.others;

import com.deveos.springboot.jpa.relations.manyone_to_onemany.Elements;
import com.deveos.springboot.jpa.relations.one_to_one.SlaveElement;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @Id
    private int id;
    private String nom;

    @Embedded
    private Address adresse;

    //save an array of items, it can be basic types like strings, integers...etc
    //it can also be Map<key, value>
    @ElementCollection
    Set<String> Emails;
    @ElementCollection
    @CollectionTable(name = "AdresseTable")
    Set<Address> LesAdresses;//it can also be more complex embedded classes

    //cascade specifies the behavior of the entity when the parent entity is destroyed (M2M, O2M, M2O)
    /**
     * It can be - ALL
     * - DETACH
     * - MERGE
     * - PERSIST
     * - REMOVE
     * - REFRESH
     */
    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private SlaveElement cclientDetail;

    //fetch specifies what to do if we fetched this entity what to do for associated entities and vice versa
    /**
     * it can be
     * - LAZY: replaces the entity by a proxy so you can later retrieve the associations if you want
     * - EAGER: get the associations right away
     *
     * EAGER is by default for @Basic and @OneToOne and @ManyToOne
     * LAZY is by default for @OneToMany and @ManyToMany
     */
    @OneToMany(mappedBy = " Client ", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Elements> lesElements = new HashSet<>();
}
