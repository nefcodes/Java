package basics2;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // put memory on heap

        int first_num = sc.nextInt();
        int second_num = sc.next23Int();
        int res = first_num + second_num;

        System.out.println(res);
        sc.close(); // give back the heap memory.

    }


}
