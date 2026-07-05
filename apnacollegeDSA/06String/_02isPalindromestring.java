public class _02isPalindromestring {
    public static void main(String[] args) {
        String s = "ranar";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String s){
        int count = 0;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) == s.charAt(s.length()-1-i)){
                count++;
            }
            
        }

        if(count == s.length()/2){
            return true;
        }

        return false;
    }
}
