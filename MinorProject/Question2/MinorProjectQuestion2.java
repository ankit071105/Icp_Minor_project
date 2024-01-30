import java.util.Scanner;

public class MinorProjectQuestion2 {
            public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number in decimal Number form");
            int decimalNumber = sc.nextInt();
            System.out.println("Base must be between 2 and 36");
            int targetBase = sc.nextInt();
            String result = convertToAnyBase(decimalNumber, targetBase);
            System.out.println(decimalNumber + " in base 10 is equivalent to " + result + " in base " + targetBase);
        }
        public static String convertToAnyBase(int n, int b) {
            if (b < 2 || b > 36) {
                throw new IllegalArgumentException("Base must be between 2 and 36");
            }
            StringBuilder result = new StringBuilder();
            if (n == 0) {
                return "0";
            }
            while (n > 0) {
                int remainder = n % b;
                char digit = (char) (remainder < 10 ? remainder + '0' : remainder - 10 + 'A');
                result.insert(0, digit);
                n /= b;
            }
            return result.toString();
        }
}
