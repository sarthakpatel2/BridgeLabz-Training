import java.util.*;
public class HexColorValidator{
    public static boolean isValidHexColor(String color){
        String hexRegex ="^#[0-9A-Fa-f]{6}$";
        return color.matches(hexRegex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hex color code: ");
        String color =sc.nextLine();
        if (isValidHexColor(color)){
            System.out.println("Hex color code is valid");
        }else{
            System.out.println("Hex color code is invalid");
        }
    }
}
