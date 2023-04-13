import java.util.Scanner;
import java.lang.Math;

public class interest {
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("\nEnter a current amount");
        double amount = reader.nextDouble();

        System.out.println("\nEnter an interest rate without the '%' symbol");
        double r = reader.nextDouble();
        r = r/100;

        System.out.println("\nEnter a number of years");
        double t = reader.nextDouble();


        amount = amount * Math.pow((1 + r), t);

        System.out.println("\nYou will have $" + amount + " in " + t + " years\n");
        reader.close();

    }

}
