import java.util.Scanner;
import java.util.Random;

public class DiceRoll {

    public static void main(String[] args) {
        // Dice roller program

        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.println("How many dices do you want?: ");
        numOfDice = scn.nextInt();

        if (numOfDice > 0) {
            for (int x = 0; x < numOfDice; x++) {
                int roll = random.nextInt(6) + 1;  // random between 1 and 6
                printDie(roll); // print the current dice rolled
                System.out.println("You rolled: " + roll);
                total = total + roll;
            }

            System.out.println("Total = " + total);
        }
        else {
            System.out.println("# of dice must be greater than zero.");
        }

        scn.close();

        }
    // Display ASCI of dice

    static void printDie(int roll){

        String dice1 = """
                      -------
                    |         |
                    |    ◉    |
                    |         |
                      -------
                    """;
        String dice2 = """
                      -------
                    |    ◉    |
                    |         |
                    |    ◉    |
                      -------
                    """;
        String dice3 = """
                      -------
                    | ◉       |
                    |    ◉    |
                    |       ◉ |
                      -------
                    """;
        String dice4 = """
                      -------
                    | ◉     ◉ |
                    |         |
                    | ◉     ◉ |
                      -------
                    """;
        String dice5 = """
                      -------
                    | ◉     ◉ |
                    |    ◉    |
                    | ◉     ◉ |
                      -------
                    """;
        String dice6 = """
                      -------
                    | ◉     ◉ |
                    | ◉     ◉ |
                    | ◉     ◉ |
                      -------
                    """;
        switch(roll) {  // based on dice roll print them.
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll.");

        }


    }
}
