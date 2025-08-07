public class DecimalConversion {
    public static void main(String[] args) {
        int decimalNumber = 25; // Inbuilt value

        String binary = Integer.toBinaryString(decimalNumber);
        String octal = Integer.toOctalString(decimalNumber);

        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Binary Equivalent: " + binary);
        System.out.println("Octal Equivalent: " + octal);
    }
}
