class Person{
    String name;
    int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    void personDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
//interface
interface Worker {
    void performDuty();
}
// Chef subclass
class Chef extends Person implements Worker{
    Chef(String name,int id){
        super(name,id);
    }
    @Override
    public void performDuty(){
        System.out.println("Duty: Cooking food ");
    }
}
//waiter subclass
class Waiter extends Person implements Worker{
    Waiter(String name,int id) {
        super(name,id);
    }
    @Override
    public void performDuty(){
        System.out.println("Duty: Serving food ");
    }
}
//main class
public class RestaurantManagement{
    public static void main(String[] args){
        Person chef=new Chef("Aman",01);
        Person waiter=new Waiter("Amit",02);
        System.out.println("Chef Details:");
        chef.personDetails();
        ((Worker) chef).performDuty();
        System.out.println("\nWaiter Details:");
        waiter.personDetails();
        ((Worker) waiter).performDuty();
    }
}
