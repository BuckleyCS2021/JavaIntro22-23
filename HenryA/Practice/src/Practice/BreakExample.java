package Practice;

import java.util.Scanner;

public class BreakExample {

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);

        boolean looking_for_3 = true;
        while (looking_for_3) {

            System.out.println("Looking for the number 3");

            String maybe_3 = reader.next();

            if (maybe_3.equals("3")) {
                break;
            }

            if (maybe_3.equals("three")) {
                break;
            }

            else {
                continue;
            }

        }

    }

}
