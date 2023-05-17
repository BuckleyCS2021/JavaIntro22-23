public class Customer {
    private static int nextAccNum = 1;
    private String name;
    private int currAccNum;

    public Customer(String n) {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }

    public String GetBill(double amount) {
        return name + ", account number " + currAccNum + ", please pay $" + amount;
    }
    public int GetNextAccNum() {
        return currAccNum + 1;
    }
    public void updateName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        Customer person = new Customer("Paul");
        System.out.println(person.GetBill(2.71828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852516642742746639193200305992));
        System.out.println(person.GetNextAccNum());
        person.updateName("Barker");
        System.out.println(person.GetBill(3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306));
    }
}
