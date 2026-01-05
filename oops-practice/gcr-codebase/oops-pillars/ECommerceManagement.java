public class ECommerceManagement{
    //polymorphic method
    static void printFinalPrice(Product product){
        double tax=0;
        if (product instanceof Taxable){
            tax = ((Taxable) product).calculateTax();
        }
        double finalPrice=product.getPrice()+tax-product.calculateDiscount();
        System.out.println("Product: "+product.getName());
        System.out.println("Final Price: "+finalPrice);
        System.out.println();
    }
    public static void main(String[] args){
        Product[] product =new Product[3];
        product[0]=new Electronics(101, "Laptop",60000);
        product[1]=new Clothing(102,"Shirt",2000);
        product[2]=new Groceries(103,"Rice",1000);
        for (Product p:product) {
            printFinalPrice(p);//runtime Polymorphism
        }
    }
}
abstract class Product{
    private int productId;
    private String name;
    private double price;
    //constructor
    public Product(int productId, String name, double price){
        this.productId=productId;
        this.name=name;
        this.price= price;
    }
    //abstract method
    public abstract double calculateDiscount();
    //encapsulation (getters & setters)
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if (price>0) {
            this.price=price;
        }
    }
    public String getName(){
        return name;
    }
}
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable {
    public Electronics(int id,String name, double price) {
        super(id,name,price);
    }
    public double calculateDiscount() {
        return getPrice() *0.10;//10% discount
    }
    public double calculateTax(){
        return getPrice()*0.18;//18% GST
    }
    public String getTaxDetails(){
        return "18% GST";
    }
}
class Clothing extends Product implements Taxable{
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }
    public double calculateDiscount(){
        return getPrice() *0.20;//20% discount
    }
    public double calculateTax(){
        return getPrice() *0.05;//5% GST
    }
    public String getTaxDetails(){
        return "5% GST";
    }
}
class Groceries extends Product{
    public Groceries(int id, String name,double price){
        super(id, name,price);
    }
    public double calculateDiscount() {
        return getPrice()*0.05;//5% discount
    }
}
