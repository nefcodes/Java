public class NumberDemo {


    public static void main(String[] args) {

        double grade1 = 54.9;
        double grade2 = 69.5;
        double grade3 = 33.5;

        double avgGrade = (grade1 + grade2 + grade3) / 3;

        System.out.println("Grade average is " + avgGrade + " %.");

        String formattedAvg = String.format("%.2f", avgGrade);

        System.out.println("Formatted Avg: " + formattedAvg);

    }
}
