Public class Customer{

    private static int nextAccNum= 1;
    private String name;
    private int currAccNum;

    public Customer(String n) {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }
}