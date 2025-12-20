import java.util.Scanner;
class BMI{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //number of persons
        int number= sc.nextInt();
        // Arrays
        double weight[]= new double[number];
        double height[]= new double[number];
        double bmi []=new double[number];
        String status[]= new String[number];
        // Input weight and height
        for (int i= 0;i<number;i++) {
            System.out.print("Enter weight (in kg) ");
            weight[i]= sc.nextDouble();
            System.out.print("Enter height (meters) ");
            height[i]= sc.nextDouble();
        }
        //calculate BMI and weight status
        for(int i= 0;i <number;i++){
            bmi[i] = weight[i]/(height[i] *height[i]);
            if (bmi[i] <=18.4) {
                status[i] = "Underweight";
            } else if (bmi[i]>=18.5 && bmi[i]<=24.9){
                status[i] = "Normal";
            } else if (bmi[i]>=25 && bmi[i]<=39.9) {
                status[i] ="Overweight";
            } else {
                status[i]="Obese";
            }
        }
        //output
        for(int i=0;i<number;i++) {
            System.out.println("Height : " + height[i]+" m");
            System.out.println("Weight : " + weight[i]+" kg");
            System.out.println("BMI : " + bmi[i]);
            System.out.println("Status : " + status[i]);
        }
    }
}
