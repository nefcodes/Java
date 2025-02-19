import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // Easy Banking Program


        double Balance = 0;  // to store balance
        boolean ProgramRunning = true;
        int Choice; // 1, 2, 3, 4.

        while(ProgramRunning){
            System.out.println("\n" +
                    "***************** Banking program ***************.");
            System.out.println(" 1. Show Balance\n 2. Deposit\n 3. Withdraw\n 4. Exit");


            System.out.print("\nEnter b/w 1-4: ");
            Choice = scn.nextInt();

            switch(Choice) {
                case 1 -> {System.out.printf("Your Balance is: "); showBalance(Balance); }
                case 2 -> Balance = Balance + deposit();
                case 3 -> Balance = Balance - withdraw(Balance);
                case 4 -> ProgramRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        System.out.println("*****************************");
        System.out.println("Thank you, have a nice day.");
        scn.close();
    }
    // show balance static method
    static void showBalance(double balance){
        System.out.printf("$%.2f \n", balance);
    }

    // deposit method
    static double deposit(){
        double amount;
        System.out.println("Enter amount to deposit: ");
        amount = scn.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }

    }

    // Withdraw method
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = scn.nextDouble();

        if(amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }


}



