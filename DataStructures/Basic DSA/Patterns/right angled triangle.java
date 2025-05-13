// RIGHT ANGLED TRIANGLE
public class pattern {

    public static void main(String[] args) {

        /*
        0 1 2 3

        o                        row 0
        o o                      row 1
        o o o                    row 2
        o o o o                  row 3


         */

        int no_of_rows = 4;

        for(int row = 1; row <= no_of_rows; row++){
            for(int col = 0; col < row; col++){
                System.out.print("X");
            }

            System.out.print("\n");

        }


    }

}
