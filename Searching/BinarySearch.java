package Searching;

 class Search {

    // Recursive Linear Search
    static int linear(int[] arr, int target, int size, int index) {
        if (index == size)
            return -1;

        if (arr[index] == target)
            return index;

        return linear(arr, target, size, index + 1);
    }

    // Recursive Binary Search
    static int binary(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] > target)
            return binary(arr, target, start, mid - 1);

        return binary(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {

        int[] arr = {11, 18, 25, 32, 40, 47, 53, 61, 75, 89};
        int num = 47;

        int ans1 = linear(arr, num, arr.length, 0);
        System.out.println("Linear Search Index: " + ans1);

        int ans2 = binary(arr, num, 0, arr.length - 1);
        System.out.println("Binary Search Index: " + ans2);
    }
}