package Practice;

public class BreakExample {

    public static void main(String[] args){
        System.out.println("Looking for the number 3.");

        for (int i=0; i <= 15; i++){

            if (i == 9){
                System.out.println("Found 9, so this loop is over.");
                break;
            }
            System.out.println("The current number is " + i);
        }
    }
}
