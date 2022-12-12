package impls;

import classes.Profile;
import classes.WhatsApp;
import enums.Status;
import services.WhatsAppService;

import javax.script.SimpleScriptContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WhatsAppServiceImpl  implements WhatsAppService {
    private List<WhatsApp> whatsAppListf = new ArrayList<>();

    public List<WhatsApp> getWhatsAppListf() {
        return whatsAppListf;
    }

    public void setWhatsAppListf(List<WhatsApp> whatsAppListf) {
        this.whatsAppListf = whatsAppListf;
    }
    public List<Profile> profiles = new ArrayList<>();

    @Override
    public String createWhatsApp() {
        try {


            System.out.print("Enter ID:");
            String ID = new Scanner(System.in).nextLine();

            System.out.print("Enter userName");
            String userName = new Scanner(System.in).nextLine();

            System.out.print("Enter passport: ");
            String password = new Scanner(System.in).nextLine();

            System.out.print("Enter phoneNumber : ");
            String phoneNumber = new Scanner(System.in).nextLine();

            WhatsApp whatsApp = new WhatsApp(ID,userName, password, phoneNumber);
            whatsAppListf.add(whatsApp);
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getAllWhatsAppusers() {
        System.out.println("Enter WhatsApp user name:");
        String userName = new Scanner(System.in).nextLine();
        for (Profile profile: profiles) {
            if(profile.getUsserName().equals(userName)){
                return null;
            }

        }

        return "Successfuly";
    }

    @Override
    public String changeWhatsAppStutus() {
        try {
            System.out.print("Enter your username : ");
            String username = new Scanner(System.in).nextLine().toLowerCase();

            System.out.print("Enter your password");
            String password = new Scanner(System.in).nextLine();


            if (username.length() < 5)
                throw new Exception("Username validation Error. Username must have 5 letters or more.");
            if (password.length() < 5)
                throw new Exception("Password validation Error. Password must have 5 letters or more.");

            for (Profile profile : profiles) {
                if (profile.getUsername().equals(username) && profile.getPassword().equals(password)) {
                    System.out.println("ALL WHATSAPP STATUSES : " + Arrays.toString(Status.values()));
                    System.out.print("Enter your STATUS index : ");
                    int index = new Scanner(System.in).nextInt();
                    if (index < 0 || index > Status.values().length - 1)
                        throw new Exception("Status index validation error. Please enter a valid index number.");
                    profile.setStatus(Status.values()[index]);
                    return "WhatsApp Status CHANGED successfully!";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
