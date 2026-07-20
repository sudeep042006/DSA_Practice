package DryRunLeetcode;

public class _875LC {

    public static void main(String[] args) {

        int arr[] = {3, 6, 7, 11};
        int k = 4;
        int hour = 8;

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        System.out.println(largest);

        int hr[] = new int[largest];

        for (int i = 0; i < hr.length; i++) {
            hr[i] = i + 1;
        }

        for (int i = 0; i < largest; i++) {
            System.out.print(hr[i] + " ");
        }

        // Binary search on hr array
        int left = 0;
        int right = hr.length;
        int count = 0;
        //check does it satisfy or not;
        for(int i = 0; i < arr.length; i++){
            count = count + (arr[i] / k) + 1;
        }

        System.out.println(count==hour);

    }
}