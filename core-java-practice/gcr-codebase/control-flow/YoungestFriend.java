import java.util.*;
class YoungestFriend{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input of age
        int AmarAge=sc.nextInt();
        int AkbarAge=sc.nextInt();
        int AnthonyAge=sc.nextInt();
        //take input of height
        int AmarHeight=sc.nextInt();
        int AkbarHeight=sc.nextInt();  
        int AnthonyHeight=sc.nextInt();
        //find youngest friend
        if(AmarAge<AkbarAge && AmarAge<AnthonyAge){
            System.out.println("Amar is youngest");
        }
        else if(AkbarAge<AmarAge && AkbarAge<AnthonyAge){
            System.out.println("Akbar is youngest");
        }
        else{
            System.out.println("Anthony is youngest");
        }
        //find tallest friend
        if(AmarHeight>AkbarHeight && AmarHeight>AnthonyHeight){
            System.out.println("Amar is tallest");
        }
        else if(AkbarHeight>AmarHeight && AkbarHeight>AnthonyHeight){
            System.out.println("Akbar is tallest");
        }
        else{
            System.out.println("Anthony is tallest");
        }
    }
}