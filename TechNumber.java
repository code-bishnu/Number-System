import java.util.Scanner;

public class TechNumber {

    public static boolean isTechNumber(int num) {
        String numStr = String.valueOf(num);
        if (numStr.length() % 2 != 0) {
            return false;
        }
        int mid = numStr.length() / 2;
        String firstHalf = numStr.substring(0, mid);
        String secondHalf = numStr.substring(mid);
        int firstPart = Integer.parseInt(firstHalf);
        int secondPart = Integer.parseInt(secondHalf);
        int sum = firstPart + secondPart;
        int squareOfSum = sum * sum;
        return squareOfSum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isTechNumber(num)) {
            System.out.println(num + " is a Tech Number.");
        } else {
            System.out.println(num + " is not a Tech Number.");
        }

        scanner.close();
    }
}