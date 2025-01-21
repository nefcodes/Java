import java.util.Scanner;

public class main {
        public static void main (String[] args) {
                //  shopping cart program

                Scanner scn = new Scanner(System.in);

                String item; int quantity;
                double price; char currency = '$'; double total;

                System.out.print("What would you like to have, sir?:   ");
                item = scn.nextLine();

                System.out.print("What's the price of one " + item + "?: ");
                price = scn.nextDouble();

                System.out.println("Quantity: ");
                quantity = scn.nextInt();

                total = price * quantity;
                System.out.print("Your grand total for "+ quantity + " " + item + " is: " + total);

                scn.close(); // free the heap memory of scanner.

        }
}
