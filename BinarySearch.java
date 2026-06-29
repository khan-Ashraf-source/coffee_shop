public class BinarySearch {
    // Performs binary search on a sorted integer array.
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Continue searching while the range is valid.
        while (left <= right) {
            // Find the middle index safely.
            int mid = left + (right - left) / 2;

            // Return the index if the target is found.
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                // Search the right half if the target is larger.
                left = mid + 1;
            } else {
                // Search the left half if the target is smaller.
                right = mid - 1;
            }
        }

        // Return -1 when the target is not present.
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}