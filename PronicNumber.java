import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPronicNumber(number)) {
            System.out.println(number + " is a Pronic Number.");
        } else {
            System.out.println(number + " is not a Pronic Number.");
        }
        scanner.close();
    }
    public static boolean isPronicNumber(int number) {
        for (int n = 0; n * (n + 1) <= number; n++) {
            if (n * (n + 1) == number) {
                return true;
            }
        }
        return false;
    }
}