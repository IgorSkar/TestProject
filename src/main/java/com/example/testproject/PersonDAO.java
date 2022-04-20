package com.example.testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String error;

    public PersonDAO() {
        this.error = "no";
        this.jdbcTemplate = new JdbcTemplate();
    }

    public void insertNewPerson(int person_ID, String name, String datum, String adress){
        String query = "INSERT INTO person VALUES (null, ?, ?, ?)";

        int result = jdbcTemplate.update(query, name, datum, adress);

        if(result > 0) {
            System.out.println(result + "person added to database");
            this.error = "person added to database";
        }
    }

    public void deletePersonByID(int person_ID){
        String query = "DELETE FROM person WHERE person_ID = ?;";
        int result = jdbcTemplate.update(query, person_ID);

        if (result > 0) {
            System.out.println(result + "person deleted from database");
            this.error = "person deleted from database";
        }
    }
}
