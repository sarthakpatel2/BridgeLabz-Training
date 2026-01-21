import java.util.*;
//category maker interface
interface Category {
    String getCategoryName();
}
class BookCategory implements Category{
    public String getCategoryName() {
        return "Books";
    }
}
class ClothingCategory implements Category{
    public String getCategoryName(){
        return "Clothing";
    }
}
class GadgetCategory implements Category{
    public String getCategoryName(){
        return "Gadgets";
    }
}
//generic product class
class Product<T extends Category>{
    String name;
    double price;
    T category;
    Product(String name,double price,T category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
    void display(){
        System.out.println("Product: "+name +", Category: "+category.getCategoryName() +", Price: "+price);
    }
}
//utility class with generic method
class DiscountUtil{
    //generic method with bounded type parameter
    static <T extends Product<?>> void applyDiscount(T product, double percentage){
        double discount= product.price*(percentage /100);
        product.price -=discount;
    }
}
//main Class
public class OnlineMarketplace{
    public static void main(String[] args){
        Product<BookCategory> book =new Product<>("Stand Alone", 500, new BookCategory());
        Product<ClothingCategory> shirt =new Product<>("T-Shirt",1200, new ClothingCategory());
        Product<GadgetCategory> phone =new Product<>("PS-5", 55000,new GadgetCategory());
        List<Product<?>> catalog=new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);
        System.out.println("Before Discount --");
        for (Product<?> p :catalog) {
            p.display();
        }
        //apply discount using generic method
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);
        System.out.println("\nAfter Discount ---");
        for (Product<?> p : catalog) {
            p.display();
        }
    }
}
