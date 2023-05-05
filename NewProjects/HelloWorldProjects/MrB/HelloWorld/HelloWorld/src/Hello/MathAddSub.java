package Hello;

public class MathAddSub {

    public int addition(int x, int y){
        int z;
        z = x + y;
        return z;
    }

    public int subtraction(int x, int y){
        int z;
        z = x - y;
        return z;
    }

    public static void main(String[] args){

        MathAddSub m = new MathAddSub();
        System.out.println(m.addition(10, 10));
        System.out.println(m.subtraction(10, 5));
    }
}
