import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Enter a Divisor");
        int number1 = scan.nextInt();
        int remainder = number%number1;
        int quotient = number/number1;
        System.out.println("Remainder: "+remainder+" Quotient: "+quotient);
    }
}
