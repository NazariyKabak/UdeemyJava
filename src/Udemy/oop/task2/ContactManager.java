package Udemy.oop.task2;

public class ContactManager {
    private Contact[] contacts;

    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];
        for (int i = 0; i < contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    public Contact getContact(int index) {
        return new Contact(contacts[index]);
    }

    public void setContact(int index, Contact contact) {
        this.contacts[index] = new Contact(contact);
    }
}
