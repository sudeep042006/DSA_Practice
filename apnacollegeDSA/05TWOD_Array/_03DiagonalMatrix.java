import java.util.*;

public class _03DiagonalMatrix {

    public static int diagonalSum(int [][]mat){
        int sum = 0;
        
        //primary diagonal
        for(int i = 0; i < mat.length; i++){
            //pd
            sum = sum + mat[i][i];

            //sd
            if(i != mat.length-1-i) sum = sum + mat[i][mat.length-i-1];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of matrix");
        int n = sc.nextInt(); 
        int [][]matrix = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int  j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int totalSum = diagonalSum(matrix);
        System.out.println(totalSum);
         
        //print matrix

        /* for(int i = 0; i < n; i++){
            for(int  j = 0; j < n; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        } */
    }
}
