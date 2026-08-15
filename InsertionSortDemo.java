public class SearchRecursion {

    // Recursive Linear Search
    public static int linearSearch(int[] arr, int target, int size, int index) {
        if (index == size)
            return -1;

        if (arr[index] == target)
            return index;

        return linearSearch(arr, target, size, index + 1);
    }

    // Recursive Binary Search
    public static int binarySearch(int[] arr, int target, int st, int end) {
        if (st > end)
            return -1;

        int mid = st + (end - st) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, target, st, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int num = 5;

        int indL = linearSearch(arr, num, arr.length, 0);
        System.out.println("[Using Linear Search] Element is at index: " + indL);

        // Pass arr.length - 1 as the last index
        int indB = binarySearch(arr, num, 0, arr.length - 1);
        System.out.println("[Using Binary Search] Element is at index: " + indB);
    }
}