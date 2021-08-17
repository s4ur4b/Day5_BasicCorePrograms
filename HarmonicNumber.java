import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int i;
        System.out.println("This is a program to print a Harmonic Number");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Harmonic Value N");
        int x = scan.nextInt();
        if (x > 0) {
            for (i = 1; i <= x; i++) {
                double table=0.0;
                table = table + (double)1 / i;
                System.out.print(table+",");
            }
        } else {
            System.out.println("Enter a number greater then 0");
        }
    }
}
