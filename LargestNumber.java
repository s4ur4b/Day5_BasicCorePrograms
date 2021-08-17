import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter any Three Numbers");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        if (number1>number2 && number1>number3){
            System.out.println("Largest number among Three is:"+number1);}
        else if (number2>number1 && number2>number3){
            System.out.println("Largest number among Three is:"+number2);}
        else System.out.println("Largest number among Three is: "+number3);
    }
}
