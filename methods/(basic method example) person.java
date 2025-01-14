
public class Person {
    //a string
    private String middleName = "Johannnesburg";

    //creating methods

    public void sayHello() {
        System.out.println("Hi");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);
    }

    //Adding two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // this is like the main function in c++, where the code begins

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("The cats can fly.");
        p1.saySomething("Dog's can teleport.");

        char middleInitial = p1.getMiddleInitial();
        System.out.println(middleInitial);
        System.out.println(p1.add(5, 10));

    }
}
