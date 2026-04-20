package arrays;

import java.util.*;

public class _01indexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {1, 5, 6, 8, 10, 75, 63};

        System.out.println("Enter a no.");
        int n = sc.nextInt();
        for(int i = 0; i < num.length; i++){
            if(num[i] == n){
                System.out.println((i+1) + " ");
            }
        }
    }
}