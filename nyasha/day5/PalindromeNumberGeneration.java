import java.util.Scanner;

public class PalindromeNumberGeneration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many palindrome numbers to print: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 1;

        while (count < n) {
            int original = num;
            int reverse = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (original == reverse) {
                System.out.print(original + " ");
                count++;
            }

            num++;
        }

        sc.close();
    }
}