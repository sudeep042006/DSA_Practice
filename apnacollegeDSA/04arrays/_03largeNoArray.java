/* import java.util.*; */
public class _03largeNoArray{
    public static void main(String[] args) {
        int arr1[] = {1, 2, 75, 95, 15, 32, 79, 21, 30};

        int result = largeNum(arr1);
        System.out.println("Largest number is: " + result);
    }

    public static int largeNum(int num[]) {
        int max = num[0];   // assume first element is largest

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
