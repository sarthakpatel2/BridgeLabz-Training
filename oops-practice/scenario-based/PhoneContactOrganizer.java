import java.util.*;
//custom Exception
class InvalidPhoneNumberException extends Exception{
    public InvalidPhoneNumberException(String message){
        super(message);
    }
}
//contact class
class Contact{
    private String name;
    private String phoneNumber;
    public Contact(String name,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getName(){
        return name;
    }
}
//main Class
public class PhoneContactOrganizer{
    static ArrayList<Contact> contacts=new ArrayList<>();
    //add Contact
    public static void addContact(String name, String phoneNumber)
            throws InvalidPhoneNumberException{
        if(phoneNumber.length() !=10){
            throw new InvalidPhoneNumberException("Phone number must be of 10 digits");
        }
        for (Contact c :contacts){
            if (c.getPhoneNumber().equals(phoneNumber)){
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added successfully.");
    }
    //search Contact
    public static void searchContact(String phoneNumber){
        for (Contact c:contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)){
                System.out.println("Contact Found: "+c.getName());
                return;
            }
        }
        System.out.println("Contact not found");
    }
    //delete Contact
    public static void deleteContact(String phoneNumber){
        boolean removed=false;
        for (int i=0;i <contacts.size();i++){
             if (contacts.get(i).getPhoneNumber().equals(phoneNumber)){
                contacts.remove(i);
                removed=true;
                break;
            }
        }
        if (removed)
            System.out.println("Contact deleted successfully");
        else
            System.out.println("Contact not found");
    }
    public static void main(String[] args){
        try{
            addContact("Sarthak","8090670806");
            addContact("Sanjh","6398543303");
            addContact("Shivam","73201");// Invalid
        } catch (InvalidPhoneNumberException e){
            System.out.println(e.getMessage());
        }
        searchContact("6398543303");
        deleteContact("8090670806");
    }
}
