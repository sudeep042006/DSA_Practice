package arrays;
import java.util.*;
public class _04getLarge {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if( numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(getLargest(num) + " is the Largest in Array");
    }

}
