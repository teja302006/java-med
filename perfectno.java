public class PerfectNumbers {
    public static void main(String[] args) {
        int n = 3; // Inbuilt test case, you can change to 0, 5, -2, -5, etc.

        int count = 0;
        int number = 1;

        System.out.print("First " + n + " perfect numbers are: ");

        while (count < n) {
            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}
