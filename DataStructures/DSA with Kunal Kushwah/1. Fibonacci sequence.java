import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {


        //Program to write fibonacci, 0, 1, 1, 2, 3, 5 .......


        // lets start from 2nd index (3rd number) upto n-1 index (nth number)

        Scanner in = new Scanner(System.in);

        int previous_no = 0;
        int current_no = 1;

        System.out.println("How many Fibonacci digits?: ");
        int nDigits = in.nextInt();

        int current_index = 2;

        System.out.print("Fibonacci: 0");

        while(current_index <= nDigits){

            System.out.print(", " + current_no);

            int next = previous_no + current_no;
            previous_no = current_no;
            current_no = next;
            current_index++;

        }


    }
}
