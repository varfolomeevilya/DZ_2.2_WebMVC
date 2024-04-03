package org.example.model;

import lombok.Builder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Builder
public class Person {

    private String name;

    private  String surname;

    private  Long salary;

}
