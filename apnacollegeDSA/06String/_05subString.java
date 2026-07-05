public class _05subString {
    public static void main(String[] args) {
        String str = "Helloworld";
        // inbuild approach; 
        String subStr = str.substring(0, 5);
        System.out.println(subStr);

        // using function our method same thing
        System.out.println(subString(str, 0, 5));

    }

    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i = si; i < ei; i++){
            subStr += str.charAt(i);
        }

        return subStr;
    }
}
