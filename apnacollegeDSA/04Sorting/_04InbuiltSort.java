import java.util.Arrays;
import java.util.Collections;

public class _04InbuiltSort {
/*     public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        Arrays.sort(arr, 0, 5); // sorts index 0 to 2

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    } */


    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};

        Arrays.sort(arr, 0, 5, Collections.reverseOrder()); // sorts index 0 to 2

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}