// mirror image right angled triangle

public class pattern {
    public static void main(String[] args) {

        /*                    n rows
                             space index   star index
                    *        n - 1 spaces, 1 star
                  * *        n - 2 spaces, 2 star
                * * *        n - 3 spaces, 3 star
              * * * *        n - n spaces, n star

         */

        int rowCount = 4;

        for(int row = rowCount; row > 0; row--){

            //for white spaces
            for(int spaces = row - 1; spaces > 0; spaces--){
                System.out.print(" ");
            }

            //for stars
            for(int stars = 0; stars <= rowCount - row; stars++){   // in first iteration it should run 1 times
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}
