import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 2, 123, 509, 4, 125};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums)); 

        int index = Arrays.binarySearch(nums, 124);

        System.out.println("Index is at: " + index); // this would output to -7, bcz 124 should be placed at index 6,
                                                    // but java return - (insertion point + 1) if not found in the array
      
    }
}
