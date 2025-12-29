import java.util.*;
public class DigitalWatch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // take start hour from user
        System.out.print("Enter start hour: ");
        int startHour=sc.nextInt();
        //outer loop for hours (start from user input)
        for (int hour=startHour;hour<24;hour++) {
            // inner loop for minutes
            for (int minute=0;minute<60;minute++){
                // power cut at exactly 13:00
                if (hour==13&&minute== 0) {
                    System.out.println("Power cut at 13:00");
                    break;
                }
                //print time
                System.out.printf("%02d:%02d\n", hour,minute);
            }
            //break outer loop after power cut
            if (hour==13){
                break;
            }
        }
    }
}
