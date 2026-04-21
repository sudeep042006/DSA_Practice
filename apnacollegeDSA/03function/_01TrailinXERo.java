import java.util.*;
public class _01TrailinXERo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int trailingzero = CountZero(num);
        System.out.println(" " + trailingzero);
        sc.close();
    }
    public static int CountZero(int num){
        int d = 0;
        int count = 0;
        if(num == 0 || num == 1){
            return 0;
        } else {
            if( num == 2 ){
                return 0;
            }
            else{
                int fact = 1;
                for(int i = 2; i <= num; i++ ){
                    fact = fact * i;
                }
                while(fact > 0){
                    d = fact%10;
                    if( d == 0){
                    count++;
                    }
                    else{
                        break;
                    }
                    fact = fact / 10;
                }

            }
        }
        return count;

    }
}