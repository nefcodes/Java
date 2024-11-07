class StringFormattingExample {
  public static void main(String[] arguments) {
    String normalstring = "hi"; //literal string
    String normalstring2 = "hi";

    String objectstring1 = new String("meow"); // object string
    String objectstring2 = new String("meow");

    System.out.println(normalstring == normalstring2);
    System.out.println(objectstring1 == objectstring2);

    // EXAMPLE OF FORMAT SPECIFIES
// FORMAT SPECIFIES FOR, String %s, Double/Float %f, char %c, boolean %b, int %d
    
    String text = "Example";
    int year = 2024;
    Float floatingValue = 1.5f;

    String Combined_string = String.format("This is an %s. I am from year %d. My car is %f years old",text, year, floatingValue);

   System.out.println(Combined_string);
      

    
    
  }
}
