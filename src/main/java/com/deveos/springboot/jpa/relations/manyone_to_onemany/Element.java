package com.deveos.springboot.jpa.relations.manyone_to_onemany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Element {
    @Id
    private int idElement;

    @OneToMany(mappedBy = "element")
    private List<Elements> elements;
}
