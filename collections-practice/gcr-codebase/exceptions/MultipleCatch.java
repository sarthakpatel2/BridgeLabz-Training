public class MultipleCatch{
    public static void main(String[] args){
        try{
            int[] arr = {10,20,30,40,50};
            int index =3;// to check index bound
            System.out.println("Value at index " +index+": "+arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized");
        }
    }
}
