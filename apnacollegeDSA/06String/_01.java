import java.util.*;
public class _01{
    public static void main(String[] args) {
        /* char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //java strings are immutable 

        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // only returns one word 
        String name1 = sc.nextLine(); //returns everything including spaces
        System.out.println(name + str + str2); */

        String name = "Tony Stark";
        System.out.println(name.length());

        // Concatenation
        String firstName = "Anushka";
        String lastName = "Chinchulkar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        // so simply + and joining operation is  concatenation


        // if i want to print the first character of the whole string -> charAt(<index>);
        System.out.println(fullName.charAt(0));

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        System.out.print(count);
    }
}
