package com.deveos.springboot.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
//by default the name of the table is "client", but you can change it with...
//@Table(name = "customer")

//with lombok, you can auto generate necessary methods for any class just by specifying some annotations
@Data //for getters, setters, equals, hasCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Element {

    /**
     * every  attribute should be private, with getters and setters
     */

    /**********************************************************************************************
     * ********************************************** Declarations
     */
    /*
     * every entity has to define an id (can't be changed), should be either
     *      - primitive (long, int...etc)
     *      - a class that wraps primitive (Long, Integer...etc)
     *      - String, Date (sql/util), BigDecimal, BigInteger
     */


    //For an embedded key we use @EmbeddedId or @IdClass
    @Id
    /*
     * @GeneratedValue, indicates that the key will be generated automatically following the strategies
     *      - AUTO: generates it by itself using the table hibernate_sequence
     *      - IDENTITY: eg: auto-increment in mySQL
     *      - SEQUENCE: uses sequence SQL
     *      - TABLE: uses a table that contains the next value of the id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
     * @Column can have multiple attributes
     *      - name: name of column in database
     *      - unique: true or false
     *      - nullable: true or false
     *      - insertable: allow updating, true or false
     *      - table: if the same attribute is used in multiple tables
     *      - length: max length
     *      - precision, scale: precision of numeric values
     *      - columnDefinition: DDL of the attribute
     */
    @Column(unique = true)
    private String name;

    private String email;

    //Every attribute that represents something that isn't persistent (eg: age) like @Ignore
    @Transient
    private int age;

    //To precise the type of the attribute, there's also DATE, TIME, TIMESTAMP
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    /*
     * Used for enums, it's either STRING: the value saved is the item itself
     * ORDINAL: the number corresponding the order of the item
     */
    @Enumerated(EnumType.STRING)
    private EnumedValues gender;

    /*
     * There's other annotations
     *      - @Lob: if you want to put the attribute in blob SQL (image..etc)
     *      - @Version: if you want to specify the version of field (used when you change the field)
     */

    /**********************************************************************************************
     * ********************************************** Methods
     */
}
