public class Main {
    public static void main(String[] args) {
        String[] fruits = {"a", "b", "c", "d"};
        for(String i : fruits) {
            System.out.println(i);
        }
    }

    static double add(double a, double b) {
        return a+b;
    }
    static double subtract(double a, double b) {
        return a-b;
    }
    static double multiply(double a, double b) {
        return a*b;
    }
    static double divide(double a, double b) {
        return a/b;
    }
    static double pow(double a, double b) {
        return Math.pow(a, b);
    }


}