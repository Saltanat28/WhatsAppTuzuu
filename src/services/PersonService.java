package services;

import classes.Passport;

public interface PersonService {


    String createPassport();

    Passport getPassportByFirstName();
}
