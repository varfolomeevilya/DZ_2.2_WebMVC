package org.example.dao;

import org.example.model.Person;

import java.util.List;

public interface PersonDAO {

    void add(Person person);
//    void delete(Person person);

     List<Person>findAll();
}
