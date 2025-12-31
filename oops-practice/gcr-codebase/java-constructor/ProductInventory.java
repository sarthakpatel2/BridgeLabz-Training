class ProductInventory{
    // Instance variables
    String productName;
    double price;
    // Class variable
    static int totalProducts=0;
    // Parameterized constructor
    ProductInventory(String productName, double price){
        this.productName=productName;
        this.price=price;
        // increment when a product is created
        totalProducts++;
    }
    //instance method
    void displayProductDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price: ₹"+price);
        System.out.println();
    }
    //class method
    static void displayTotalProducts(){
        System.out.println("Total Products Created: "+totalProducts);
    }
    public static void main(String[] args) {
        ProductInventory p1 =new ProductInventory("Laptop", 55000);
        ProductInventory p2 =new ProductInventory("Mobile", 25000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        ProductInventory.displayTotalProducts();
    }
}
