public class _07stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); // append means add but in word way.
//          Time Complexity = O(n);  
        
/*      If it was           then it's  |
                   sb += ch, <---------+ 
        Time Complexity = O(26 * {Time taken for coping each letter})
                        = O(n * n) = O(n²) */


        }

        System.out.println(sb);
        System.out.println(sb.length());
    }
}
  