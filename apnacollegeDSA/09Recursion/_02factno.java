import java.util.*;
public class _02factno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();

        int factorial = fact(n);
        System.out.println(factorial);
    }

    private static int fact(int n){
        if(n == 0 || n == 1) return 1;

        return n*fact(n-1);
    }


}
