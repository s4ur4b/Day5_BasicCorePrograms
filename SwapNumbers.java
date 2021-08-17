import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number-1");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        System.out.println("Enter number-2");
        int number2 = scan.nextInt();
        int tempNo1 = number2;
        int tempNo2 = number1;
        System.out.println("Number-1: "+tempNo1+" Number-2: "+tempNo2);
    }
}
