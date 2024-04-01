package org.example.controller;

import lombok.AllArgsConstructor;


import org.example.model.Person;
import org.example.service.PersonService;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/company")
public class PersonController{

     private final PersonService personService;

     @GetMapping("/add-person")
     public String add(){
         return "add-person";
     }

    @PostMapping("/add-person")
    public String add(@ModelAttribute("building") Person person){
        personService.add(person);
        return "redirect:/company/persons";
    }
    @GetMapping("/persons")
    public String findAll(Model model){
        List<Person>persons = personService.findAll();
        model.addAttribute("persons",persons);
        System.out.println(persons);
        return "persons";
    }






     
}
