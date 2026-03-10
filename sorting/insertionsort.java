package sorting;

public class insertionsort {
    static void sortarray(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while( j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }


        }
    }


    public static void main(String[] args) {
        int[] arr={8,3,6,2,4,5};
        sortarray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
}
