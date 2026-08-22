package sorting;

public class MergeSort2 {
    static void main() {
        int[] arr = {7,1,4,0,8,9,6};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void mergeSort(int[] arr,int l,int r) {
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,r,mid);
    }
    public static void merge(int[] arr,int l,int r,int mid) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }
        int i=0,j=0;
        k = l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                k++;
                i++;
            }
            else{
                arr[k++] = R[j];
                j++;
            }
        }
            while(i<n1){
                arr[k++] = L[i++];
            }
            while(j<n2) arr[k++] = R[j++];
    }
}
