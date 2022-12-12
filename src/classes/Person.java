package classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;

public class Person {
    private long ID;
    private String name;
    private String LastNAme;
    private Gender gender;
    private Country country;
    private LocalDate dataOfBirth;

    public Person(long ID, String name, String lastNAme, Gender gender, Country country, LocalDate dataOfBirth) {
        this.ID = ID;
        this.name = name;
        LastNAme = lastNAme;
        this.gender = gender;
        this.country = country;
        this.dataOfBirth = dataOfBirth;
    }

    public Person() {

    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNAme() {
        return LastNAme;
    }

    public void setLastNAme(String lastNAme) {
        LastNAme = lastNAme;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", LastNAme='" + LastNAme + '\'' +
                ", gender=" + gender +
                ", country=" + country +
                ", dataOfBirth=" + dataOfBirth +
                '}';
    }
}
