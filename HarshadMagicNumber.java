import java.util.Scanner;

public class HarshadMagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isHarshadMagicNumber(number)) {
            System.out.println(number + " is a Harshad Magic Number.");
        } else {
            System.out.println(number + " is not a Harshad Magic Number.");
        }
        scanner.close();
    }
    public static boolean isHarshadMagicNumber(int number) {
        int sumOfDigits = sumDigits(number);
        if (number % sumOfDigits != 0) {
            return false;
        }
        int sum = sumOfDigits;
        while (sum >= 10) {
            sum = sumDigits(sum);
        }
        return sum == 1;
    }
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}