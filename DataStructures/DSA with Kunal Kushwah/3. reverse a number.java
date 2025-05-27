public class Test {

    public static void main(String[] args) {

        int num = 12305;

        int answer = 0;

        while(num > 0){
            int remainder = num % 10; // gives the last digit
            num /= 10; // divi by 10 and get a decimal value, int will ommit the decimal

            answer = answer * 10 + remainder;
        }
        
        System.out.println(answer);

    }
}
