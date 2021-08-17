import java.util.Scanner;

public class PrimeFactors {
    static PrimeFactors obj = new PrimeFactors();

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        obj.primeFactor(number);
    }
    boolean isPrime(int number){
        int count = 0;
        boolean flag = false;
        for (int i = 2; i < number; i++){
            if (number%i==0){
                count++;
            }
        }
        if (count==0){
            flag=true;
            return flag;}
        else
            return flag;
    }
    void primeFactor(int number){
        int i=2;
        while (number > 1) {
        if (number%i==0 && obj.isPrime(i)==true){
            System.out.println(i);
            number=number/i;
        }
        else
            i=i+1;
        }
        }
    }

