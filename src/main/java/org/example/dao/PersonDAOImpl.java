package org.example.dao;

import org.example.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PersonDAOImpl implements PersonDAO{

    private final List<Person> persons;

    public PersonDAOImpl(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public void add(Person person){
        this.persons.add(person);
    }

    @Override
    public List<Person> findAll(){
        return this.persons;
    }
}
