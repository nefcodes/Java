// Taking input
// a class scanner is used to take input by instancing it


import java.util.Scanner; // import the Scanner

class TakingInput { // this line you enter the same name as your file.java name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // since we taking input from the console we tpe system.in

        System.out.println("What's your name?"); // this has /n at the end
        String u_name = scanner.nextLine(); //this takes input

        System.out.printf("Hello %s, how old are you? :-)    : ", u_name);
        int u_age = scanner.nextInt(); // takes whatever is entered after this display

        // clear the buffer of last ENTER
        scanner.nextLine();



        //similarly to take double scanner.nextDouble(); and so on

        System.out.printf("%d is a great age to be in life!, %s.", u_age, u_name);

        // VERY VERY IMP. the nextLine(); method takes all input including ENTER. but the nextInt(); method doesn't take enter and it's left in the buffer. and add another nextLine(); it won't even allow you to take input as the last Enter would be added there.
        // so to get over this you always need to add another nextLine(); after taking nextInt(); input
        scanner.close(); // give the memory back


    }
}
