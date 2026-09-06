import java.util.Arrays;

public class First_Last_Occurence_of_NUM_sorted_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 8, 8, 8, 9};
        int target = 8;

        int[] arr = new int[2];
        arr[0]= first(nums, target);
        arr[1] = Last(nums, target);
        
        System.out.println(Arrays.toString(arr));
       
    }
    static int first(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int f = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                f = mid;
                high = mid - 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return f;
    }
    static int Last (int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int l = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                l = mid;
                low = mid + 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return l;
    }
}
