import java.util.Scanner;

public class MovieDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        double discount = 0;
        double finalPrice;

        if (age < 18) {
            discount = ticketPrice * 20 / 100;
        }

        finalPrice = ticketPrice - discount;

        System.out.println("\nOriginal Price: " + ticketPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);

        sc.close();
    }
}