class Item {
    String itemCode;
    String itemName;
    double itemPrice;
    void displayItem() {
        System.out.println("itemCode : " +itemCode);
        System.out.println("itemPrice : "+ itemPrice);
        System.out.println("itemName : "+ itemName);
    }
    public static void main(String[] args) {
        Item i1=new Item();
        i1.itemCode="01AA";
        i1.itemPrice= 500.0;
        i1.itemName="Water bottle";
        Item i2= new Item();
        i2.itemCode= "01BB";
        i2.itemPrice= 700.0;
        i2.itemName= "Rice";
        Item i3 =new Item();
        i3.itemCode= "02AA";
        i3.itemPrice= 400.0;
        i3.itemName= "blackboard";
        i1.displayItem();
        i2.displayItem();
        i3.displayItem();
    }
}
