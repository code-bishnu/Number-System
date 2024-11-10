import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isBouncy(number)) {
            System.out.println(number + " is a Bouncy Number.");
        } else {
            System.out.println(number + " is not a Bouncy Number.");
        }
        scanner.close();
    }
    public static boolean isBouncy(int number) {
        String numStr = Integer.toString(number);
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) < numStr.charAt(i + 1)) {
                isIncreasing = true;
            } else if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                isDecreasing = true;
            }
            if (isIncreasing && isDecreasing) {
                return true;
            }
        }
        return false;
    }
}