package arrays;
import java.util.*;
public class _06revArr {

    public static void revArr(int arr[]){
        int first = 0, last = arr.length-1;

        while(first < last){
            int temp;
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array");
         int n = sc.nextInt();
         int arr[] = new int[n];
         System.out.println("Enter the array");
         for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
         }
         revArr(arr);
         for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" " );
         }
    }
}
