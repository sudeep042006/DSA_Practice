/*  Here we need to find the largest String Lexicographically.
 Using compareTo property for each letter which compares the letters Lexicographically.*/

public class _06largestString {
    public static void main(String[] args) {

        String fruits[] = {"apple", "mango","banana"};
        String largest = fruits[0];

        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
/*  Time complexity of this code is O(x * n),
    where x -> length of String and n loop end no. 
    why? because {compareTo} compares string letter by letter so its TC is x */

}
