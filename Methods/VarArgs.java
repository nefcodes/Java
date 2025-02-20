public class VarArgs {

    public static void main(String[] args) {
        // VarArgs allow you to make methods that can take many arguments,
        // no need for overloading methods with (...) ellipsis

        System.out.println(add(1, 2, 3, 4, 5));
    }

    static int add(int... items) {

        int sum = 0;  
        for(int item : items) {  // enchanced for loop
            sum = sum + item;
        }
        return sum;
    }
}
