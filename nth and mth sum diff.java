import java.util.Arrays;

public class MthMaxNthMin {
    public static void main(String[] args) {
        int[] arr = {14, 16, 87, 36, 25, 89, 34};
        int M = 1, N = 3;

        Arrays.sort(arr); // Sort the array in ascending order

        int nthMin = arr[N - 1]; // Nth minimum is at index N-1
        int mthMax = arr[arr.length - M]; // Mth maximum is at (length - M)

        int sum = nthMin + mthMax;
        int diff = Math.abs(mthMax - nthMin); // Always positive

        System.out.println(M + "st Maximum Number = " + mthMax);
        System.out.println(N + "rd Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
    }
}
