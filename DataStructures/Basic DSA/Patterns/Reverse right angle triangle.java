// Reverse right angled triangle

public class pattern {


    public static void main(String[] args) {

        int row_count = 16;

        for(int row = row_count; row > 0; row--){
            for(int col = 0; col < row; col++){
                System.out.print("x");
            }
            System.out.print("\n");
        }
    }

}
