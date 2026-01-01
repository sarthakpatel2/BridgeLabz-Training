class Product{
    //static variable
    static double discount=10.0;
    //instance variables
    String productName;
    double price;
    int quantity;
    //final variable
    final String productID;
    //constructor using 'this'
    Product(String productID,String productName,double price, int quantity){
        this.productID=productID;
        this.productName=productName;
        this.price =price;
        this.quantity=quantity;
    }
    //static method to update discount
    static void updateDiscount(double newDiscount){
        discount=newDiscount;
    }
    //calculate price after discount
    double getDiscountedPrice() {
        return price-(price*discount /100);
    }
    //display product details using instanceof
    static void displayProductDetail(Object obj){
        if (obj instanceof Product) {
            Product p =(Product) obj;
            System.out.println("Product ID: "+p.productID);
            System.out.println("Product Name: "+p.productName);
            System.out.println("Price: "+ p.price);
            System.out.println("Quantity: "+ p.quantity);
            System.out.println("Discount: "+discount +"%");
            System.out.println("Price after Discount: "+p.getDiscountedPrice());
            System.out.println();
        }else{
            System.out.println("Invalid product object");
        }
    }
    public static void main(String[] args){
        Product p1=new Product("01", "Shoes", 1200, 5);
        Product p2=new Product("02", "Jackets", 800, 10);
        //display product details
        displayProductDetail(p1);
        displayProductDetail(p2);
    }
}
