import java.util.*;

public class _01decno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        decOrder(n);

    }

    private static int decOrder(int n ){
        if(n == 1){
            System.out.println(" "+n);
            return 0; 
        }
        System.out.println(" "+ n);
        return decOrder(n - 1);
    }
}
