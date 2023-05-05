package Practice;
// This is review of add and subtract
public class Math {

    public int addition(int x, int y){
        int z;
        z = x + y;
        return z;

    }

    public int subtract(int x, int y){
        int z;
        z = x - y;
        return z;
    }

    public static void main(String[] args){

        Math e = new Math();
        System.out.println(e.addition(6, 23));
        System.out.println(e.subtract(4, -10));
    }
}
