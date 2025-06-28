public class Main {


    public static void main(String[] args) {


        String givenString = "alphabet";
        StringBuilder reversedString = new StringBuilder();

        for(int i = givenString.length() - 1; i >= 0; i--){  // .length give the total no of elements

            reversedString.append(givenString.charAt(i));

        }

        System.out.println("original string: " + givenString);
        System.out.println(("reversed string: " + reversedString));

    }

}
