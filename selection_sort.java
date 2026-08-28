import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            int last = arr.length - i - 1;
            int max = maxvalues(arr, 0, last);
            swapeed(arr, max, last);
        }
    }
    static int maxvalues(int[] arr, int start, int last){
        int max1 = start;
        for(int i = start; i <= last; i++){
            if(arr[i] > arr[max1]){
                max1 = i;
            }
        }
        return max1;
    }
    static void swapeed(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
