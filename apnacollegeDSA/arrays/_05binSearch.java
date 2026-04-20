package arrays;
import java.util.*;
public class _05binSearch{

    public static void binarySearch(int arr[], int key){
        int low = arr[0], high = arr.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(key == arr[mid]){
                System.out.println("Found at position " + (mid+1));
                break;
            }
            else if(key < arr[mid]){
                high = mid - 1;
            }
            else if(key > arr[mid]){
                low = mid + 1;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter array sorted");
        for(int i = 0; i < num.length; i++){
            num[i] =  sc.nextInt();
        }
        System.out.println("enter the number to search");
        int key = sc.nextInt();
        binarySearch(num, key);
        sc.close();
    }
}




























/* package arrays;
import java.util.*;
public class _05binSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size(sorted)");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for( int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter no to search: ");
        int key = sc.nextInt();
        int low = arr[0], high = arr.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(key == arr[mid]){
                System.out.println("Found at position " + (mid+1));
                break;
            }
            else if(key < arr[mid]){
                high = mid - 1;
            }
            else if(key > arr[mid]){
                low = mid + 1;
            }

        }

    }
}
 */