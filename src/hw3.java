public class hw3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 15, 20, 25, 30};
        int target = 15;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result == -1) System.out.println("Target not found.");
        else System.out.println("Target found at index: " + result);
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return binarySearch(arr, target, low, mid - 1);
        else return binarySearch(arr, target, mid + 1, high);
    }
}

