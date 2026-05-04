import java.util.*;
class Solution {
    public static boolean isPalindrome(int x) {
        int xcopy = x;
        int rev = 0;
        while(x!=0){
            int d = x%10;
            rev = rev * 10 + d;
            x = x/10;
        }
        if(xcopy<0){
            return false;
        }
        else if(xcopy == rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(isPalindrome(num));

    }
}