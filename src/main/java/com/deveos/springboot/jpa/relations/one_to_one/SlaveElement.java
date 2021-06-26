package com.deveos.springboot.jpa.relations.one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SlaveElement {

    @Id
    private int idSlave;

    @OneToOne
    private MasterElement masterElement;

}
