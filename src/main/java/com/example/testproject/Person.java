package com.example.testproject;

public class Person {
    private int person_ID;
    private String name;
    private String datum;
    private String adress;

    public Person() {
    }

    public Person(int person_ID, String name, String datum, String adress){
        this.person_ID = person_ID;
        this.name = name;
        this.datum = datum;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "com.example.testproject.Person{" +
                "person_ID=" + person_ID +
                ", name='" + name + '\'' +
                ", datum='" + datum + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public int getPerson_ID() {
        return person_ID;
    }

    public void setPerson_ID(int person_ID) {
        this.person_ID = person_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
