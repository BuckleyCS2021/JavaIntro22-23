package Practice;

public class Multiply {

    int value1, value2;


    Multiply(){

    }

    Multiply(int x, int y) {

    }

    {
        value1 = x;
        value2 = y;

    }

    public int Multiply(){
        int z = value1 * value2;
        return z;
    }

    public static void main(String[] args){

        Multiply e = new Multiply(10, 10);
        System.out.println(e.Multiply());
    }
}
