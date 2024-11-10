import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String numStr = String.valueOf(number);
        int length = numStr.length();

        int sum = 0;
        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, i + 1);  // i + 1 because positions are 1-based
        }
        if (sum == number) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
        scanner.close();
    }
}
