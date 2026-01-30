import java.util.*;
public class ValidateLicense{
    // Username validation
    public static boolean isValidUsername(String username) {
        String usernameRegex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return username.matches(usernameRegex);
    }
    //license plate validation
    public static boolean isValidLicensePlate(String plate) {
        String plateRegex = "^[A-Z]{2}[0-9]{4}$";
        return plate.matches(plateRegex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String username=sc.nextLine();
        if (isValidUsername(username)) {
            System.out.println("Username is valid");
        } else{
            System.out.println("Username is invalid");
        }
        // license plate input
        System.out.print("Enter license plate number: ");
        String plate=sc.nextLine();
        if (isValidLicensePlate(plate)){
            System.out.println("License plate is valid");
        }else{
            System.out.println("License plate is invalid");
        }
    }
}
