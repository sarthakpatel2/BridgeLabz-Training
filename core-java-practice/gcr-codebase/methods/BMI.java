import java.util.*;
public class BMI{
    public static void calculateBMI(double[][] data){
        for(int i=0;i<data.length;i++){
            //calculate bmi
            double heightInMeters=data[i][1]/100;
            data[i][2] =data[i][0]/(heightInMeters*heightInMeters);
        }
    }
    public static String[] getBMI(double[][] data){
        String[] status =new String[data.length];
        for (int i =0;i< data.length;i++) {
            double bmi=data[i][2];
            //check bmi conditions
            if (bmi<=18.4)
                status[i]="Underweight";
            else if (bmi<=24.9)
                status[i]= "Normal";
            else if (bmi<=39.9)
                status[i]="Overweight";
            else
                status[i]= "Obese";
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double[][] data = new double[10][3]; 
        // col0 = weight, col1 =height(cm),col2=BMI
        for (int i =0;i <10;i++) {
            //get input from user
            System.out.print("Enter weight of person "+(i+1));
            data[i][0]=input.nextDouble();
            System.out.print("Enter height of person " +(i+ 1));
            data[i][1]= input.nextDouble();
        }
        calculateBMI(data);
        //display
        String[] status = getBMI(data);
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i =0;i<10;i++) {
            System.out.println(data[i][1]+"\t\t"+ data[i][0] +"\t\t"+data[i][2]+"\t"+status[i]);
        }
    }
}
