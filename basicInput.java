import java.util.Scanner;

public class basicInput {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();

            System.out.println("Your gpa: ");
            double gpa = scanner.nextDouble();

            System.out.println("Are you a student? (true/false): ");
            boolean isStudent = scanner.nextBoolean();

            System.out.println("Hello, " + name);
            System.out.println("You are " + age + " years old, aren't you?");
            System.out.println("You got " + gpa + " GPA.");
            System.out.println("Your student status is: " + isStudent);

            scanner.close();


            /*
            * Common problems, after taking input from scanner as int or double and then use scanner for strings, the input
            * buffer has the \n remaining when you press enter and that goes to the scanner.nextString(),
            * to clear it, just simply use scanner.nextLine() and don't assign it to anything to clear the input buffer
            * */

    }
}
