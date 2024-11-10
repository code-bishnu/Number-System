import java.util.Scanner;

public class TribonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isTribonacci(number)) {
            System.out.println(number + " is part of the Tribonacci sequence.");
        } else {
            System.out.println(number + " is not part of the Tribonacci sequence.");
        }
        scanner.close();
    }
    public static boolean isTribonacci(int number) {
        int a = 0, b = 1, c = 1;

        // If the number is one of the first three numbers
        if (number == a || number == b || number == c) {
            return true;
        }
        while (c < number) {
            int nextTerm = a + b + c;
            a = b;
            b = c;
            c = nextTerm;

            if (c == number) {
                return true;
            }
        }

        return false;
    }
}
