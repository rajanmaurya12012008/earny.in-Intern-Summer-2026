import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many Armstrong numbers to print: ");
        int n = sc.nextInt();

        int count = 0;
        int number = 1;

        while (count < n) {

            int originalNumber = number;
            int temp = number;

            int digits = 0;

            while (temp != 0) {
                digits++;
                temp = temp / 10;
            }

            temp = number;
            int sum = 0;

            while (temp != 0) {

                int digit = temp % 10;

                sum += (int) Math.pow(digit, digits);

                temp = temp / 10;
            }

            if (number == 0) {
                sum = 0;
            }

            if (sum == originalNumber) {
                System.out.print(originalNumber + " ");
                count++;
            }

            number++;
        }

        sc.close();
    }
}