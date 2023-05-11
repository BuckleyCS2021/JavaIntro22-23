package practice;

public class BreakExample {

    public static void main (String[] args){
        System.out.println("Looking for the number 9.");

        for (int i = 0; i <= 9; i++){

            if (i == 9){
                System.out.println("Found nine so this loop is over.");
                break;
            }
            System.out.println("The current number is " + i);
        }
    }
}
