package com.example.testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonDAO dao;
    Person person;


    public void inserNewPerson(int person_ID, String name, String datum, String adress){
        dao.insertNewPerson(person_ID, name, datum, adress);
    }

    public void deletePersonByID(int person_ID ){
        dao.deletePersonByID(person_ID);
    }
}


