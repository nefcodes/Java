import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        String[] names = {"Fluff", "Brownie", "Peanuts", "Pink"};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));
        System.out.println("\nSorting arrays.. ");

        Arrays.sort(nums);
        Arrays.sort(names);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));

    }
}
