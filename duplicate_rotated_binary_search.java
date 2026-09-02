import java.util.Scanner;

public class duplicate_rotated_binary_search {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        // Input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Input target
        int target = in.nextInt();

        System.out.println(search(arr, target));

        in.close();
    }

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (arr[mid] == target) {
                return mid;
            }

            // ⭐ Duplicate case
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }

            // Left half is sorted
            else if (arr[start] <= arr[mid]) {

                // Target is inside left sorted half
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                }

                // Target is in right half
                else {
                    start = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target is inside right sorted half
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                }

                // Target is in left half
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
