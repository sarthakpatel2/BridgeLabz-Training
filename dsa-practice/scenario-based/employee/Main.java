package employee;

public class Main{
    public static void main(String[] args){
        Employee manager=new Manager("Sanjh", 80000);
        System.out.printf("%.2f%n", manager.getBonus());
        Employee dev1=new Developer("Boby", 60000);
        System.out.printf("%.2f%n", dev1.getBonus());
        Employee dev2 =new Developer("Ayushi", 40000);
        System.out.printf("%.2f%n", dev2.getBonus());
    }
}
