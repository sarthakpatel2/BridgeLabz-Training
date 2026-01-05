import java.util.*;
public class CafeMenuApp{
    // array storing 10 fixed menu items
    static String[] menuItems={"Tea","Coffee","Sandwich","Burger","Pizza","Pasta","Noodles","Samosa","Juice","Ice Cream"};
    // method to display menu
    public static void displayMenu(){
        System.out.println("--- Cafeteria Menu ---");
        for (int i=0;i<menuItems.length;i++){
            System.out.println(i+" : "+menuItems[i]);
        }
    }
    //method to get item by index
    public static String getItemByIndex(int index){
        if (index >=0&& index<menuItems.length){
            return menuItems[index];
        }else{ 
            return "Invalid item selection";
        }
    }
    //main method
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        displayMenu();
        System.out.print("Enter item index to order: ");
        int choice=sc.nextInt();
        String selectedItem = getItemByIndex(choice);
        System.out.println("You ordered: "+selectedItem);
    }
}
