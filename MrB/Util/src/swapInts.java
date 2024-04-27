import java.util.Scanner;

class Util {
    public static [] swapInts(int[] ints) {
        return new Util[][]{ints[1], ints[0]};
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intOne = 0;
        int intTwo = 0;
        int[] intList = new int[2];
        intOne = scanner.nextInt();
        intTwo = scanner.nextInt();
        intList[0] = intOne;
        intList[1] = intTwo;

        Util.swapInts(intList[]);


        System.out.println(intList[0]);
        System.out.println(intList[1]);
    }
}