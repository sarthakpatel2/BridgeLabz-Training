package com.addressbook.dao;
import com.addressbook.model.ContactPerson;
import java.util.ArrayList;
import java.util.List;
public class AddressBookDAO{
    private List<ContactPerson> contactList = new ArrayList<>();
    public boolean addContact(ContactPerson person) {
        if (contactList.contains(person)){
            return false;
        }
        contactList.add(person);
        return true;
    }
    public List<ContactPerson> getAllContacts(){
        return contactList;
    }
    public boolean deleteContact(String firstName){
        return contactList.removeIf(
                p ->p.getFirstName().equalsIgnoreCase(firstName)
        );
    }
    public ContactPerson findContact(String firstName){
        for (ContactPerson person : contactList){
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                return person;
            }
        }
        return null;
    }
}
