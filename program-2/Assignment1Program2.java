import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    
        // get the base from the user
        System.out.print("Please enter a base (2-9): ");
        int base = userinput.nextInt();
      
        // Calculate maximum 4-digit number in the given base
        int maxnumber = (base - 1) * (int)(Math.pow(base, 3) + Math.pow(base, 2) + base + 1);
        System.out.println("\nThe maximum, 4-digit, base 10 number in base " + base + " is " + maxnumber + ".");
        
        // Get number from the user to convert into the given base
        System.out.print("\nNow, enter a base 10 number in the range 0 to " + maxnumber + " to convert: ");
        int usernumber = userinput.nextInt();
        
        // Convert to the target base
        int convertednumber = usernumber;

        // Calculate each digit (from left to right)
        int digit1 = convertednumber / (int)Math.pow(base, 3);
        convertednumber %= Math.pow(base, 3);
        
        int digit2 = convertednumber / (int)Math.pow(base, 2);
        convertednumber %= Math.pow(base, 2);
        
        int digit3 = convertednumber / base;
        int digit4 = convertednumber % base;

        // Display result
        System.out.println("\n" + usernumber + " (base 10) = " + digit1 + digit2 + digit3 + digit4 + " (base " + base + ")");
        
        userinput.close();

  }
}
