import java.util.Scanner;

public class switchcomputer {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose b/w: smartphone, tablet or airplane...");

        String computertype = scanner.nextLine();


        switch (computertype) {
            case "smartphone":
                System.out.println("smartphone");
                break;
            case "tablet":
                System.out.println("tablet"); break;
            case "airplane":
                System.out.println("airplane"); break;

            default:
                System.out.println("choose a valid option");
        }

        scanner.close();
    }
}
