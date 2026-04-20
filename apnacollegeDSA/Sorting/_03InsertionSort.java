package Sorting;

public class _03InsertionSort {
    public static int[] insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];   // store current element value
            int prev = i - 1;

            // finding correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        int Sorted_Arr[] = insertionSort(arr);

        for (int i = 0; i < Sorted_Arr.length; i++) {
            System.out.print(Sorted_Arr[i] + " ");
        }
    }
}