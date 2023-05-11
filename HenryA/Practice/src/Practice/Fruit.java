package Practice;
import java.util.Scanner;
import java.lang.Math;
public class Fruit {
    //this is just practice class construction
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String[] fruit = {"Apples", "Strawberries", "Raspberries", "Bananas", "Oranges", "Limes", "Lemons", "Blueberries"};
        double[] amounts = {2.99, 4.99, 5.99, 8.99};

        System.out.println("Before we start... please enter your bank balance: ");

        double bank_balance = reader.nextDouble();

        boolean running = true;

        while (running) {

            System.out.println("What fruit do you want to buy, we have: " + fruit[0] + ", " + fruit[1] + ", " + fruit[2] + ", " + fruit[3] + ", " + fruit[4] + ", " + fruit[5] + ", " + fruit[6] + ", and " + fruit[7]);

            String fruit_choice = reader.next();

            int fruit_price = (int) (Math.random() * amounts.length);

            System.out.println(fruit_choice + " cost " + amounts[fruit_price] + ". How many would you like to buy?");

            double fruit_num = reader.nextInt();

            double final_cost = (amounts[fruit_price] *= fruit_num);

            System.out.println("Your final amount is $" + final_cost + " Would you like to buy? (type 'y' for yes and 'n' for no)");
            String y_or_n = reader.next();

            double amount_needed = (bank_balance -= final_cost);
            if (amount_needed < 0) {
                amount_needed *= -1;
            }

            if (y_or_n.equals("y")) {
                if (final_cost > bank_balance) {
                    System.out.println("You can't afford this! You need $" + amount_needed + " more dollars. Try again later");
                    System.out.println("Would you like to continue shopping? (yes or no) ");

                    String continue_shopping = reader.next();

                    if (continue_shopping.equals("yes")) {
                        continue;
                    }

                    if (continue_shopping.equals("no")) {
                        System.out.println("Thank you anyways!");
                        running = false;
                    }
                }
                if (final_cost < bank_balance) {
                    System.out.println("Thank you for shopping! You now have $" + amount_needed + " left in your bank account!");
                    boolean continute_shopping_loop = true;
                    while (continute_shopping_loop) {
                        System.out.println("Would you like to continue shopping? (yes or no) ");

                        String continue_shopping = reader.next();

                        if (continue_shopping.equals("yes")) {
                            continute_shopping_loop = false;
                            continue;
                        }

                        if (continue_shopping.equals("no")) {
                            System.out.println("Thank you anyways!");
                            continute_shopping_loop = false;
                            running = false;
                        }

                        else {
                            System.out.println("That's not an acceptable answer, please type exactly whats in the perentheses");
                        }
                    }
                }
            }

            if (y_or_n.equals("n")) {
                System.out.println("Looser");
            }

        }


    }
}
