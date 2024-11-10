import java.util.Scanner;

public class DuckNumber {
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        if (numStr.charAt(0) == '0') {
            return false;
        }
        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isDuckNumber(num)) {
            System.out.println(num + " is a Duck Number.");
        } else {
            System.out.println(num + " is not a Duck Number.");
        }

        scanner.close();
    }
}
