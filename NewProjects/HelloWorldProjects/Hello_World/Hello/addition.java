package Hello;

public class addition {

    public int adding(int x, int y) {
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
        addition m = new addition();
        System.out.println(m.adding(2,2));
        System.out.println(m.subtract(2, 4));
        }
    }

