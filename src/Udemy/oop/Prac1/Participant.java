package Udemy.oop.Prac1;

public class Participant {
    private String name;
    private String contactInfo;

    public Participant(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
