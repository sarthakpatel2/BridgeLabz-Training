import java.util.Scanner;
class BMIUsing2D{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //number of persons
        System.out.print("Enter number of persons ");
        int number = sc.nextInt();
        // 2D array to store weight, height, BMI
        double[][] personData= new double[number][3];
        String[] weight= new String[number];
        // input weight and height 
        for (int i=0;i< number;i++){
            System.out.print("Enter weight (kg): ");
            personData[i][0] =sc.nextDouble();
            System.out.print("Enter height (meters): ");
            personData[i][1]=sc.nextDouble();
            //validation
            if (personData[i][0]<= 0||personData[i][1]<= 0) {
                System.out.println("Invalid input");
                i--; // re-enter the data
            }
        }
        //calculate BMI and weight status
        for (int i= 0;i < number;i++) {
            personData[i][2] =
                    personData[i][0]/(personData[i][1]* personData[i][1]);
            if (personData[i][2]<= 18.4) {
                weight[i] ="Underweight";
            } else if (personData[i][2]<= 24.9 && personData[i][2]>=18.5) {
                weight[i] ="Normal";
            } else if (personData[i][2]<=39.9 && personData[i][2]>=25) {
                weight[i]="Overweight";
            } else {
                weight[i]="Obese";
            }
        }
        //display results
        for (int i = 0; i < number; i++) {
            System.out.println("Weight :" +personData[i][0]+" kg");
            System.out.println("Height :" +personData[i][1]+" m");
            System.out.println("BMI :" +personData[i][2]);
            System.out.println("Status :" +weight[i]);
        }
    }
}
