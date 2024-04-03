package org.example.controller;

import lombok.AllArgsConstructor;


import lombok.RequiredArgsConstructor;
import org.example.model.Person;
import org.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/company")
public class PersonController{
   @Autowired
     private final PersonService personService;
    @GetMapping("/persons")
    public String findAll(Model model){
        List<Person>persons = personService.findAll();
        model.addAttribute("persons",persons);
        System.out.println(persons);
        return "persons";
    }
     @GetMapping("/add-person")
     public String add(){
         return "add-person";
     }

    @PostMapping("/add-person")
    public String add(@ModelAttribute("building") Person person){
        personService.add(person);
        return "redirect:/company/persons";
    }







}
