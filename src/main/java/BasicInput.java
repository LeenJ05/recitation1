import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        int userInt = scnr.nextInt();
        System.out.println("Enter double:");
        double userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        char userChar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        String userString = scnr.next();

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        // TODO (2): Output the four values in reverse
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        // TODO (3): Cast the double to an integer, and output that integer
        int newInt = (int) userDouble;
        System.out.println(userDouble + " casted to an integer is: " + newInt );
    }
}