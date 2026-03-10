package sorting;

public class countsort {

    static int maxnumber(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    // give the prefixsum of the given array
    static void prefixsumarray(int[] count){
        for(int i=1;i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }

    }

// helps in get frequency of array elements .
    static void countsort(int[] arr,int n){
        int[] output = new int[n];
       int max = maxnumber(arr);
       int[] count = new int[max+1];
       for(int i = 0;i<n;i++){
           count[arr[i]]++;
       }
       // prefixsum array will give the index of element to be placed
        prefixsumarray(count);
       int k = 0;
       for(int i = n-1;i>=0;i--){
           int idx = count[arr[i]]-1;
           output[idx] = arr[i];
           count[arr[i]]--;

       }
       for(int i = 0;i<n;i++){
           arr[i] = output[i];
       }

    }
    static void displayarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        int[] arr = {1,4,5,2,2,5};
        int n = arr.length;
        countsort(arr,n);
        System.out.println("Sorted array is : ");
        displayarray(arr);

    }
}
