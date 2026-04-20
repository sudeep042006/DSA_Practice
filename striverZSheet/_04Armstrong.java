package striverZSheet;
import java.util.*;

public class _04Armstrong {
    public static boolean isArmstrong(int num){
        int copy = num;
        int sum =0;
        while(num!=0){
            int d = num%10;
            sum = sum + d *d*d;
            num = num/10;
        }
        if(copy == sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isArmstrong(num);
        if(isArmstrong(num)==true){
            System.out.println("Yes the number is Armstrong");
        }else{
            System.out.println("No it is not an Armstrong");
        }
    }
}
