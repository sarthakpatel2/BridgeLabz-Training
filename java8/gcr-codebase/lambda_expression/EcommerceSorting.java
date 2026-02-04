import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Product{
    String name;
    double price;
    double rating;
    double discount;
    public Product(String name,double price, double rating, double discount){
        this.name=name;
        this.price= price;
        this.rating=rating;
        this.discount=discount;
    }
    @Override
    public String toString(){
        return name+"| Price: "+price+"| Rating: "+rating+"| Discount: "+discount+"%";
    }
}
public class EcommerceSorting{
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop",69000,4.9,10));
        products.add(new Product("Mobile",48000,4.8,15));
        products.add(new Product("Headphones",11000,4.4,20));
        products.add(new Product("Smart Watch",15000,4.6,17));
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Sorting Campaign:");
        System.out.println("1. Sort by Price");
        System.out.println("2. Sort by Rating");
        System.out.println("3. Sort by Discount");
        int choice=sc.nextInt();
        Comparator<Product> comparator=null;
        switch (choice){
            case 1:
                comparator=(p1, p2)->Double.compare(p2.price, p1.price);
                break;
            case 2:
                comparator=(p1, p2) ->Double.compare(p2.rating, p1.rating);
                break;
            case 3:
                comparator=(p1, p2)->Double.compare(p2.discount, p1.discount);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        //dynamic sorting
        products.sort(comparator);
        System.out.println("\nSorted Products:");
        products.forEach(System.out::println);
    }
}
