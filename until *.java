public class CharCounter {
    public static void main(String[] args) {
        char[] chars = {'W', 'd', 'A', 'G', 'g', 'H', '*'}; // Inbuilt values

        int upper = 0, lower = 0, digit = 0;

        for (int i = 0; chars[i] != '*'; i++) {
            char ch = chars[i];

            if (ch >= 'A' && ch <= 'Z') upper++;
            else if (ch >= 'a' && ch <= 'z') lower++;
            else if (ch >= '0' && ch <= '9') digit++;
        }

        System.out.println("Total count of lower case: " + lower);
        System.out.println("Total count of upper case: " + upper);
        System.out.println("Total count of numbers = " + digit);
    }
}
