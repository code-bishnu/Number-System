
    import java.util.Scanner;

    public class SpyNumber {

        public static boolean isSpyNumber(int num) {
            int sum = 0;
            int product = 1;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                product *= digit;
                num /= 10;
            }
            return sum == product;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (isSpyNumber(num)) {
                System.out.println(num + " is a Spy Number.");
            } else {
                System.out.println(num + " is not a Spy Number.");
            }

            scanner.close();
        }
    }

