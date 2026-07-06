
public class _09stringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String CompressStr = compressString(str);
        System.out.println(CompressStr);
    }

    public static String compressString(String s){
        StringBuilder str = new StringBuilder("");
        int count = 0;
        char curr = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(curr == s.charAt(i)){
                count++;
            }
            else{
                str.append(curr);
                str.append(count);
                curr = s.charAt(i);
                count = 1;
            }
        }

        str.append(curr);
        str.append(count);


        return str.toString();
    }
    
}
