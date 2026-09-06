import java.util.Scanner;

public class Rotated_binary_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        
        int target = in.nextInt();
        System.out.println(search(arr, target));
        in.close();
    }
    static int search(int arr[], int target ){
        int pivot = findpivot(arr);
        if(pivot == -1){
            return binarysearch(arr, target, 0, arr.length - 1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(arr[0] <= target){
            return binarysearch(arr, target, 0, pivot - 1);
        }else{
            return binarysearch(arr, target, pivot + 1, arr.length - 1);
        }
    }
    static int binarysearch(int[] arr, int target, int start, int end){
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findpivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
