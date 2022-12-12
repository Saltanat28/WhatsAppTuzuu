package classes;

import enums.Status;

import java.util.List;

public class Profile {
    private String usserName;
    private String password;
    private String image;
    private String  phoneNumber;
    private Status status;
    private List<Profile>contacts;
    private List<String[]>messages;

    public Profile(String usserName, String password, String image, String phoneNumber,
                   Status status, List<Profile> contacts, List<String[]> messages) {
        this.usserName = usserName;
        this.password = password;
        this.image = image;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.contacts = contacts;
        this.messages = messages;
    }

    public String getUsserName() {
        return usserName;
    }

    public void setUsserName(String usserName) {
        this.usserName = usserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Profile> getContacts() {
        return contacts;
    }

    public void setContacts(List<Profile> contacts) {
        this.contacts = contacts;
    }

    public List<String[]> getMessages() {
        return messages;
    }

    public void setMessages(List<String[]> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "usserName='" + usserName + '\'' +
                ", password='" + password + '\'' +
                ", image='" + image + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", status=" + status +
                ", contacts=" + contacts +
                ", messages=" + messages +
                '}';
    }

    public Object getUsername() {
        return usserName;
    }
}
