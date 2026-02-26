import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    
        System.out.print("Please enter a base (2-9): ");
        int base = userinput.nextInt();

        int maxnumber = (base - 1) * (int)(Math.pow(base, 3) + Math.pow(base, 2) + base + 1);
        
        System.out.println("\nThe maximum, 4-digit, base 10 number in base " + base + " is " + maxnumber + ".");
        
        System.out.print("\nNow, enter a base 10 number in the range 0 to " + maxnumber + " to convert: ");
        int usernumber = userinput.nextInt();
        
        int convertednumber = usernumber;

        int digit1 = convertednumber / (int)Math.pow(base, 3);
        convertednumber %= Math.pow(base, 3);
        
        int digit2 = convertednumber / (int)Math.pow(base, 2);
        convertednumber %= Math.pow(base, 2);
        
        int digit3 = convertednumber / base;
        int digit4 = convertednumber % base;

        System.out.println("\n" + usernumber + " (base 10) = " + digit1 + digit2 + digit3 + digit4 + " (base " + base + ")");
        
        userinput.close();

  }
}
