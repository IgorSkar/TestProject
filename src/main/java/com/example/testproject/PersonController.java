package com.example.testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping("/insertNewPerson")
    public void insertNewPerson(@RequestParam(value="person_ID", defaultValue = "-1") int person_ID,
                                @RequestParam(value="name", defaultValue = "noName") String name,
                                @RequestParam(value="datum", defaultValue = "noDatum") String datum,
                                @RequestParam(value="adress", defaultValue = "noAdress") String adress) {
        personService.inserNewPerson(person_ID, name, datum, adress);
    }

    @DeleteMapping("/deletePersonByID")
    public void deletePersonByID(@RequestParam(value ="person_ID", defaultValue = "-1") int person_ID){
        personService.deletePersonByID(person_ID);
    }
}
