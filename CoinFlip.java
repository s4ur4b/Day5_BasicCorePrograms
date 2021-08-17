import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        int i;
        int tails=0;
        int heads=0;
        //Getting user input for the number of time the coin is to be flipped
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of times to flip coin");
        int x= scan.nextInt();
    for (i=0;i<x; i++){
        int random=(int) Math.floor((Math.random()*10)%2);
    switch (random){
        case 0:
            System.out.println("Tails");
            tails++;
            break;
        case 1:
            System.out.println("Heads");
            heads++;
            break;
    }//switch case ends here
    }//for loop ends here
        int headPercentage = (heads*100/x);
        int tailPercentage = (tails*100/x);
        System.out.println("Heads: "+heads+"Tails: "+tails);
        System.out.println("Heads Percentage: "+headPercentage+"  Tails Percentage: "+tailPercentage);
    }
}
