import java.util.*;
public class ValidateIP{
    public static boolean isValidIP(String ip){
        String ipRegex="^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"+"(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        return ip.matches(ipRegex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter IPv4 address: ");
        String ip =sc.nextLine();
        if (isValidIP(ip)){
            System.out.println("Valid IPv4 Address");
        } else{
            System.out.println("Invalid IPv4 Address");
        }
    }
}
