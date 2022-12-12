import classes.Person;
import impls.PersonServiceImpl;
import impls.WhatsAppServiceImpl;
import services.PersonService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonServiceImpl personService = new PersonServiceImpl();
        WhatsAppServiceImpl whatsAppService = new WhatsAppServiceImpl();
    while (true){
        System.out.println("""
                >>>>>>>>Comands<<<<<<<<<<
                1.Create passport
                2.Get all Passport
                3.Register to WhatsApp
                4.Get all WhatsAppUsers
                5.Change WhatsAppStatus
                6.Get all whatsApp status
                7.Get all  country
                8.Go to your profile
                9.Get passport by first name
                10.Get  WhatsApp status by user 
                11.Add contact
                12.Sena message
                Choose one comand:""");

        int option = new Scanner(System.in).nextInt();
        switch (option){
            case 1:
                System.out.println(personService.createPassport());
                break;
            case 2:
                System.out.println(personService.getPassportByFirstName());
                break;
            case 3:
                System.out.println(whatsAppService.createWhatsApp());
            case 4:
                System.out.println(whatsAppService.changeWhatsAppStutus());
                break;



        }
    }
    }
}