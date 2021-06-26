package com.deveos.springboot.jpa.relations.manyone_to_onemany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Elements {

    @Id
    private Long idElements;

    @ManyToOne
    //needs JoinColumn to specify which column it is linked to @JoinColumn(name="idClient")
    private Element element;

    public Elements() {
    }
}
