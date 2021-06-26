package com.deveos.springboot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deveos.springboot.jpa.Element;

import java.util.Date;
import java.util.List;

public interface ElementRepository extends JpaRepository<Element, Long> {

    //There's some predefined methods: save(), findAll(), findById(id)

    //Personalized Methods (Check Course)
    List<Element> findClientsByName(String nom);
    List<Element> findClientsByNameIsLike(String n);
    List<Element> findClientsByBirthDateAfter(Date birthDate) ;
    boolean existsByEmailContaining(String e);
}
