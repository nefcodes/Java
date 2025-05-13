// PROGRAM FOR HOLLOW RECTANGLE
public class pattern {

    public static void main(String[] args) {

        /*
        create this rectangle

        0 1 2 3
        * * * *  row 0        4 rows / 4 colums
        *     *  row 1
        *     *  row 2
        * * * *  row 3        row x col = matrix

         */

        int no_of_rows = 4;
        int no_of_col = 10;

        for(int row = 0; row < no_of_rows; row++){
            for(int col = 0; col < no_of_col; col++){
                if ( row == 0 || col == 0 || row == no_of_rows -1 || col == no_of_col - 1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}
