// this is from a teacher
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        // Use Scanner to read in from file
        Scanner in = new Scanner(new File("data.csv"));

        // Loop as long as file has a next line
        while (in.hasNextLine()) {
            // Store entire line in variable
            String line = in.nextLine();

            // Create an array with all the values in it, split by ","
            String[] info = line.split(",");

            // Print the array to see that it works
            System.out.println(Arrays.toString(info));
        }
    }
}