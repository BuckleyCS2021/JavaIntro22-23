public class Customer {

    int nextAccNum = 1;
    String name;
    int currAccNum;

    public Customer() {

        name = "Chris";
        currAccNum = nextAccNum;

    }

    double amount_due = 50.50;
    public void bill() {
        System.out.println(name + ", account number " + currAccNum + ", please pay $" + amount_due);
        return;
    }

    public void next_acc_num() {
        nextAccNum = currAccNum += 1;
        System.out.println("The next customer account number will be" + nextAccNum);
    }

    public void updateName(String n) {
        name = n;
    }

    public static void main(String[] args) {
        
    }
}

