import java.util.Arrays;

public class main{
    public static void main(String[] args) {

        int[][] two_d_array = {{1, 2}, {3, 4}};

        for (int[] array : two_d_array) {
            for (int item : array) {
                System.out.println(item + " ");
            }
        }

    }
}
