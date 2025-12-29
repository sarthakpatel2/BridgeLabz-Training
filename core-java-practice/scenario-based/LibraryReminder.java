import java.util.*;
public class LibraryReminder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalFine=0;
        // loop for 5 books
        for (int i=1;i<=5;i++){
            //user input
            System.out.println("\nBook "+i);
            //due date
            System.out.print("Enter due date: ");
            int dueDate=sc.nextInt();
            //return date
            System.out.print("Enter return date: ");
            int returnDate=sc.nextInt();
            //calculate total fine
            if (returnDate>dueDate){
                int lateDays=returnDate-dueDate;
                int fine=lateDays*5;
                totalFine+=fine;
                System.out.println("Returned late by "+lateDays+" days");
                System.out.println("Fine for this book: "+fine);
            } else{
                System.out.println("Returned on time");
            }
        }
        System.out.println("\nTotal fine for all books: "+totalFine);
    }
}
