import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {-1, -32, 0, 54, 98, 32, -12};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr){
        boolean swapeed;
        for(int i =0; i < arr.length; i++){
            swapeed = false;
            for(int j = 1; j <= arr.length - i - 1; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -  1] = temp;
                    swapeed = true;
                }
            }
            if(!swapeed){
                break;
            }
        }
    }
}
