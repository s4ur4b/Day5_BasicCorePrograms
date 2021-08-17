import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
       int i;
        System.out.println("This is a program to print a table of powers of two");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the power value N");
        int x = scan.nextInt();
        if (x<31){
            for (i=1;i<=x;i++){
                int table=2;
                table = table * i;
            System.out.println(" 2^"+i+"="+table);
            }
        }
        else{
            System.out.println("Enter a number less than 31");
        }
    }
}
