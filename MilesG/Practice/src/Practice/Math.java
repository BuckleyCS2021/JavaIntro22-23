package Practice;

//this is review + and minus
public class Math {

    public int addition (int x, int y){
        int z;

        z = (x + y);

        return z;
    }

    public int subtraction (int x, int y){
        int z;

        z = (x - y);

        return z;
    }

    public static void main (String[] args){

        Math e = new Math();
        System.out.println(e.addition(6,8));
        System.out.println(e.subtraction(4,90));
    }

}
