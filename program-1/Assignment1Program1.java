import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    Random random = new Random();
    // Display block letters 'BP'
    System.out.println("Block Letters 'BP'");
    System.out.println();
    System.out.println("BBBBBB      PPPPPP   ");
    System.out.println("BBB   BBB   PPP   PPP");
    System.out.println("BBB   BBB   PPP   PPP");
    System.out.println("BBBBBB      PP PPP   ");
    System.out.println("BBB   BBB   PPP      ");
    System.out.println("BBB   BBB   PPP      ");
    System.out.println("BBBBBB      PPP      ");
    
    // Prompt the user for a 5-character string and displayed the middle 3 characters reversed
    System.out.println("Enter a 5-character string:");
    String input = userinput.nextLine();
    while (input.length() != 5) {
      System.err.println("Please enter exactly 5 characters:");
      input = userinput.nextLine();
    }
    String middleChars = input.substring(1, 4);
    String reversed = new StringBuilder(middleChars).reverse().toString();

    // Ask the user for a temperature in Fahrenheit and convert it to Celsius
    System.out.println("Enter a temperature in Fahrenheit:");
    double fahrenheit = userinput.nextDouble();
    double celsius = (fahrenheit - 32) * 5.0 / 9.0;
    String rounded = String.format("%.2f", celsius);

    // Generate a random integer between 32 and 16384
    int randomNum = random.nextInt(16384 - 32 + 1) + 32;

    // Display all the outputs
    System.out.println("Reversed middle string: " + reversed);
    System.out.println("Temperature in Celsius: " + rounded);
    System.out.println("Random number: " + randomNum);

    // Combine all outputs and display them
    String combined = rounded + reversed + randomNum;
    System.out.println("Combined output: " + combined);

    userinput.close();
  }
}