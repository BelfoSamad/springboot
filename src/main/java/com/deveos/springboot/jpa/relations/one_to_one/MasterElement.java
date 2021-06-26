package com.deveos.springboot.jpa.relations.one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MasterElement {
    @Id
    private int idMaster;

    //To not declare 2 foreign keys we can use mappedBy, create it only in ClientDetail
    @OneToOne(mappedBy = "masterelement")
    private SlaveElement slaveElement;
}
