import java.util.*;

public class _01matrices {
    static int  n = 3, m = 3;

    public static void searchElement(int num, int matrix[][]){
        for( int i = 0; i < n ; i++){
            for( int j = 0; j < m; j++){
                if( matrix[i][j] == num){
                    System.out.print("Found at (" + (i+1)+","+(j+1)+  ")  position");
                }
            }
         }

    }
    public static void main(String[] args) {
         int matrix[][] = new int[3][3];
         Scanner sc = new Scanner(System.in);
         for( int i = 0; i < n ; i++){
            for( int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
         }

         //print
         for( int i = 0; i < n; i++){
            for( int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }

         System.out.print( "Search Element: ");
         int SearchNum = sc.nextInt();
         searchElement(SearchNum, matrix);
         sc.close();
    }
}