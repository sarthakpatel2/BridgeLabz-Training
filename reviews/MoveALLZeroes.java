class MoveALLZeroes{
    public static void main(String[] args) {
        int arr[]={2,5,0,7,0,9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after moving all zeroes to end:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}