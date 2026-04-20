    import java.util.*;
    public class solution{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int num1[] = new int[m];
            int num2[] = new int[n];
            for(int i = 0; i < m; i++){
                num1[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                num2[i] = sc.nextInt();
            }
            int merge[] = new int[m+n];
            int i = 0, j = 0;
            int k = 0;
            while( i < m && j < n){
                if(num1[i] <= num2[j]){
                    merge[k] = num1[i];
                    i++;
                }
                else{
                    merge[k] = num2[j];
                    j++;
                }
                k++;
            }
            while( i < m){
                merge[k++] = num1[i++];
            }

            while( j < n){
                merge[k++] = num2[j++];
            }
            median(merge);
        }
        public static void median(int merge[]){
            float median;
            median = ((float)merge[0] + (float)merge[merge.length-1]) / 2;
            System.out.println(median + " ");
        }
    }