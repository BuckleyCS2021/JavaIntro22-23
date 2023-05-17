package Practice;

public class BreakExample {

    public static void main (String [] args){
        System.out.println("Looking for the number 3");

        for (int i = 0; i <= 5; i++){

            if (i == 3){
                System.out.println("Found three so this loop is over");
                break;
            }

            System.out.println("the current number is " + i);

        }
    }

}
