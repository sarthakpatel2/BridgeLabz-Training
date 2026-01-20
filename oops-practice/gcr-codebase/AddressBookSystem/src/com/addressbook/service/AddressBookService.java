package com.addressbook.service;
import com.addressbook.dao.AddressBookDAO;
import com.addressbook.model.ContactPerson;

public class AddressBookService{
    private AddressBookDAO dao =new AddressBookDAO();
    public void addContact(ContactPerson person) {
        boolean added=dao.addContact(person);
        if (added){
            System.out.println("Contact added successfully");
        } else {
            System.out.println("Duplicate contact not allowed");
        }
    }
    public void editContact(String firstName, String newCity, String newPhone) {
        ContactPerson person =dao.findContact(firstName);
        if (person != null) {
            person.setCity(newCity);
            person.setPhoneNumber(newPhone);
            System.out.println("Contact updated successfully");
        } else{
            System.out.println("Contact not found");
        }
    }
    public void deleteContact(String firstName) {
        boolean deleted = dao.deleteContact(firstName);
        System.out.println(deleted ? "Contact deleted." : "Contact not found");
    }
    public void displayContacts() {
        dao.getAllContacts().forEach(System.out::println);
    }
}