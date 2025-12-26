import java.util.*;
public class CoffeeCounter{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    // choose coffee from the given menu
    System.out.println("Coffee menu-:");
    System.out.println("Espresso → ₹100\n" +"\n" + "Cappuccino → ₹150\n" +"\n" + "Latte → ₹180");
    while (true){
      // for taking the choice
      System.out.print("Enter your choice -:");
      String choice = sc.next();
      // exit logic
      if (choice.equals("Exit") || choice.equals("exit")) {
        System.out.println("Thank Your for visiting our coffee shop!!!");
        break;
      }
      // for check the quantity
      System.out.print("Enter the quantity -: ");
      int quantity =sc.nextInt();
      // for bill
      double bill= 0;
      double gst= 0;
      if (choice.equals("Espresso") || choice.equals("espresso")) {
        System.out.println("========================");
        System.out.println("Coffee Type -:" + choice +
            "\nTotal quantity -:" + quantity +
            "\nTotal Bill -:" + (bill = (quantity * 180)) +
            "\nGST(5%) -:" + (gst = bill * (0.05)) +
            "\nTotal -:" + (gst + bill));
        System.out.println("========================");
      } else if (choice.equals("Cappuccino") || choice.equals("cappuccino")) {
        System.out.println("========================");
        System.out.println("Coffee Type -:" + choice +
            "\nTotal quantity -:" + quantity +
            "\nTotal Bill -:" + (bill = (quantity * 180)) +
            "\nGST(5%) -:" + (gst = bill * (0.05)) +
            "\nTotal -:" + (gst + bill));
        System.out.println("========================");
      } else if (choice.equals("Latte") || choice.equals("latte")) {
        System.out.println("========================");
        System.out.println("Coffee Type -:" + choice +
            "\nTotal quantity -:" + quantity +
            "\nTotal Bill -:" + (bill = (quantity * 180)) +
            "\nGST(5%) -:" + (gst = bill * (0.05)) +
            "\nTotal -:" + (gst + bill));
        System.out.println("========================");
      } else {
        System.out.println("Please write valid coffee name from the menu");
        System.out.println("========================");
      }
      bill = 0;
      gst = 0;
    }
  }
}