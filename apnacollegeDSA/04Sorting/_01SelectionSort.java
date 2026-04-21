import java.util.*;
public class _01SelectionSort {
        public static int[] selectionSort(int arr[]){
            for(int i = 0; i<arr.length-1; i++){
                int minPos = i;
                for(int j = i+1; j<arr.length; j++){
                    if(arr[minPos] > arr[j]){
                    minPos = j;
                    }
                }
                //swap
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
            return arr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for( int i = 0; i < arr.length; i++ ){
                arr[i] = sc.nextInt();
            }
            int SortedArr[] = selectionSort(arr);
            for( int i = 0; i < arr.length; i++){
                System.out.print(SortedArr[i] + " ");
            }
            sc.close();
        }
    }
