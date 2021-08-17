import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Getting user input value of year
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year");
        int x = scan.nextInt();
        if (x%4==0 && x%100 != 0 || x%400==0){
            System.out.println("It is a leap year");
        }
        else
            System.out.println("It is not a leap year");
    }
}