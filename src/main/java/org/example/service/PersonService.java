package org.example.service;
import lombok.AllArgsConstructor;
import org.example.dao.PersonDAO;
import org.example.model.Person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService{
    @Autowired
       private final PersonDAO personDAO;

      public void add(Person person) {
       personDAO.add(person);
      }

      public List<Person>findAll(){
      return personDAO.findAll();
      }


}
