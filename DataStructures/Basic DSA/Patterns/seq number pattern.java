// PRINT THE PATTERN
/*

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

 */

public class pattern {
    public static void main(String[] args) {


        int rowCount = 6;

        for(int row = 1; row <= rowCount; row++){


            //print the digits
            for(int digit = 1; digit <= row; digit++){
                System.out.print(digit + " ");
            }

            System.out.print("\n");
        }
    }
}
