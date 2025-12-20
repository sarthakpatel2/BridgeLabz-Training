import java.util.Scanner;

class YoungestFriend{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name[]= {"Amar","Akbar","Anthony"};
        int age[]= new int[3];
        double[] height= new double[3];
        //input age and height
        for(int i= 0;i < 3;i++){
            System.out.println("Enter age of" + name[i] +":");
            age[i]= sc.nextInt();
            System.out.println("Enter height of "+ name[i]+ ":");
            height[i] =sc.nextDouble();
        }
        // assume first friend is youngest and tallest
        int youngest_Index= 0;
        int tallest_Index= 0;
        //find youngest and tallest
        for (int i= 1;i <3;i++) {
            if (age[i]< age[youngest_Index]) {
                youngest_Index= i;
            }
            if (height[i] >height[tallest_Index]) {
                tallest_Index= i;
            }
        }
        //output result
        System.out.println("\nYoungest Friend is " + name[youngest_Index]);
        System.out.println("Tallest Friend is " + name[tallest_Index]);
    }
}
