public class NoOccurences {


    public static void main(String[] args) {
        int x = 234985222;

        int counter = 0;

        while (x >0){
            int remainder = x % 10;
            if(remainder == 2){
                counter++;
            }

            x = x / 10; // since its an int, floating point would be discarded
        }

        System.out.print("2 occurs " + counter + " times.");
    }
}
