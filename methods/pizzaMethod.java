
import java.util.Scanner;
import java.util.Random;

public class main{
    public static void main(String[] args) {

        String pizza = bakePizza("capsicum", "Super spicy");
        System.out.println(pizza);

    }

    public static String bakePizza(String bread){
        return bread + " pizza";
    }

    public static String bakePizza(String bread, String spice){
        return bread + " pizza, spice leve: " + spice ;
    }
}
