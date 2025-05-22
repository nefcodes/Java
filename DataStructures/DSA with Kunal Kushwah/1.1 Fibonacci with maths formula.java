import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {


        //Program to write fibonacci, 0, 1, 1, 2, 3, 5 .......


        // lets start from 2nd index (3rd number) upto n-1 index (nth number)

        Scanner in = new Scanner(System.in);

        int f_Nmin2 = 0;
        int f_Nmin1 = 1;


        System.out.println("How many Fibonacci digits?: ");
        int nDigits = in.nextInt();

        int current_index = 2;

        System.out.print("Fibonacci: 0, 1");

        while(current_index <= nDigits){

            int Nth_fibo = f_Nmin2 + f_Nmin1;
            System.out.print(", " + Nth_fibo);

            f_Nmin2 =f_Nmin1;
            f_Nmin1 = Nth_fibo;

            current_index++;

        }


    }
}
