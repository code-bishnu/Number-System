import java.util.Scanner;

public class DudeneyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isDudeneyNumber(number)) {
            System.out.println(number + " is a Dudeney Number.");
        } else {
            System.out.println(number + " is not a Dudeney Number.");
        }
        scanner.close();
    }
    public static boolean isDudeneyNumber(int number) {
        int cubeRoot = (int) Math.cbrt(number);
        if (cubeRoot * cubeRoot * cubeRoot != number) {
            return false;
        }
        int sumOfDigits = sumDigits(number);
        return sumOfDigits == cubeRoot;
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