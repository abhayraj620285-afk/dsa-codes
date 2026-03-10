package sorting;

import java.util.Collections;
import java.util.ArrayList;
public class bucketsort {

     static void bucketsorting(float[] arr,int n){

         // creates multidimension array of variable size.
         ArrayList<Float>[] buckets = new ArrayList[n];

         // creates empty bucket list.
        for(int i=0;i<n;i++){
            buckets[i] = new ArrayList<Float>();
        }

        // adding elements in buckets
         for(int i=0;i<n;i++){
             int bucketIndex = (int) (arr[i]*n);
             buckets[bucketIndex].add(arr[i]);
         }

         //sort elements
         for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
         }

         // merge all buckets to get final sorted array
         int index = 0;
         for(int i = 0;i<buckets.length;i++){
             ArrayList<Float> currBucket = buckets[i];
             for(int j=0;j<currBucket.size();j++){
                arr[index++] = currBucket.get(j);
             }

         }
    }

     static void displayarray(float[] arr){
         for(float val : arr){
             System.out.println(val);
         }
     }


    public static void main(String[] args) {
        float[] arr = {0.5f,0.3f,0.4f,0.2f,0.1f};
        int n = arr.length;
        bucketsorting(arr,n);
        System.out.println("sorted array is : ");
        displayarray(arr);
    }

}
