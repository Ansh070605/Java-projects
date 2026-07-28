import java.util.Scanner;

public class Binary_search_algo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        in.close();
        
        
        int ans = binarysearch(arr, target);
        System.out.println(ans);


    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
}
