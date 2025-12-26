public class RandomNumber{
    public static int[] generateRandomArray(int size){
        int[] arr= new int[size];
        //generating random array
        for (int i=0;i<size;i++) {
            arr[i]=(int)(Math.random()*9000)+1000;
        }
        return arr;
    }
    public static double[] findAvgMinMax(int[] numbers){
        //initial values declared
        int sum=0;
        int min=numbers[0];
        int max=numbers[0];
        for (int num :numbers) {
            sum+=num;
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        //find average
        double average=(double)sum/numbers.length;
        return new double[]{average,min,max};
    }
    public static void main(String[] args) {
        int[] numbers =generateRandomArray(5);
        double[] result =findAvgMinMax(numbers);
        System.out.println("Generated numbers:- ");
        for (int num :numbers){
            System.out.print(num+" ");
        }
        //display the result
        System.out.println("\nAverage: "+result[0]);
        System.out.println("Minimum: "+result[1]);
        System.out.println("Maximum: "+result[2]);
    }
}
