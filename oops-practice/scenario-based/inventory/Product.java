package inventory;
public class Product {
    int id;
    String name;
    int stock;
    public Product(int id, String name, int stock){
        this.id =id;
        this.name =name;
        this.stock= stock;
    }
    @Override
    public String toString(){
        return id+","+name + ","+stock;
    }
    public static Product fromString(String line){
        String[] parts = line.split(",");
        return new Product(Integer.parseInt(parts[0]),parts[1],Integer.parseInt(parts[2])
        );
    }
}
