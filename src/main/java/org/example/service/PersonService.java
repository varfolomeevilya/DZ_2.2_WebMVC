package org.example.service;
import lombok.AllArgsConstructor;
import org.example.dao.PersonDAO;
import org.example.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService implements PersonDAO {
      private final PersonDAO personDAO;
      List<Person> persons;

      @Override
      public void add(Person person) {
       persons.add(person);
      }

//      @Override
//      public void delete(Person person) {
//      personDAO.delete(person);
//      }

      @Override
      public List<Person>findAll(){
      return persons;
      }


}
