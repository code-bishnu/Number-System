import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isMagicNumber(number)) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }
        scanner.close();
    }

    public static boolean isMagicNumber(int number) {
        while (number >= 10) {
            number = sumDigits(number);
        }
        return number == 1;
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