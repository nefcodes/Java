import java.util.Random;

// Heads or tails program.

public class main {
        public static void main(String [] args) {

                Random rnd = new Random();

                boolean isHeads = rnd.nextBoolean();

                if(isHeads) {
                        System.out.println("Heads.");
                } else {
                        System.out.println("Tails.");
                }
        }
}
