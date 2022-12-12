package impls;

import classes.Passport;
import services.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    private List<Passport> passports = new ArrayList<>();

    public List<Passport> getPassports() {
        return passports;
    }

    public void setPassports(List<Passport> passports) {
        this.passports = passports;
    }

    @Override
    public String createPassport() {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter ID: ");
            long ID = Long.parseLong(new Scanner(System.in).nextLine());

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your Last name: ");
            String lastName = new Scanner(System.in).nextLine();

            System.out.println("Enter your gender: ");
            String gender = new Scanner(System.in).nextLine();

            System.out.println("Enter your country: ");
            String country = new Scanner(System.in).nextLine();

            System.out.println(" Enter your Data of birth ");;
            String[] dataOfBirthlist = scanner.nextLine().trim().split("_");

            if(ID <= 0) throw new Exception("ID validatin Error. Please enter number bigger than 0");
            if(name.isEmpty() || name.matches("[0-9]+"))  throw  new Exception("Name validation Error. Write name without counts");
            if(lastName.isEmpty() || lastName.matches("[0-9]+") ) throw new Exception("Last name validation Error.Write only with letters");
            if(!gender.equals("FEMALE") && !gender.equals("MALE") ) throw new Exception("Gender validation Error. ");
            if(country.isEmpty() || country.matches("[0-9]+")) throw new Exception("Country validation Error. Please write letters");

            Passport newPassports = new Passport(ID,name, lastName,gender, country, dataOfBirthlist);
            passports.add(newPassports);

        }catch (Exception e ) {
        e.printStackTrace();

        return null;
    }

    return "Password created  successfuly!";
    }

    @Override
    public Passport getPassportByFirstName() {
        System.out.println("Enter your first name: ");
        String firstName = new Scanner(System.in).nextLine();

        for (Passport passport: passports) {
            if(passport.getName().equals(firstName)){
                return (Passport) passports;
            }

        }
        return null;
    }


}
