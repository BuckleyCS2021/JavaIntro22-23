package Practice;

public class BreakExample {

    public static void main(String[] args){
        System.out.println("Looking for the number 3.");

        for (int i = 0; i <= 5; i++){

            if (i == 3){
                System.out.println("Found 3, loop over");
                break;
            }
            System.out.println("The current number is " + 3);
        }
    }
}

