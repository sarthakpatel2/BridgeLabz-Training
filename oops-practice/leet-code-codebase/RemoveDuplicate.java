public class RemoveDuplicate{
    public static void main(String[] args){
        int[] arr={1,2,3,2,4,1,5};
        int[] temp=new int[arr.length];
        int size=0;
        for (int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for (int j=0;j<size;j++){
                if (arr[i]==temp[j]) {
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate){
                temp[size]=arr[i];
                size++;
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int i=0;i<size;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
