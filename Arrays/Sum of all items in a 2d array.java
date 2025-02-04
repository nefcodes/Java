import java.util.Arrays;

public class main{
    public static void main(String[] args) {

        int[][] two_d_array = {{1, 25}, {3, 4}};
        int counter = 0;

        for (int[] array : two_d_array) {
            for (int item : array){
                counter += item;
            }
        }

        System.out.printf("\n The total of this 2d array is: %d", counter);
    }
}
