public class BankAccount {
    // Instance/Object Variables
    int id;
    String name;
    long balance;

    // Class/Static Variables
    static int numberOfAccounts;

    {
        System.out.println("Came to object initialization block");
    }

    static {
        numberOfAccounts= 1000;
        System.out.println("Came to static block");
    }

//    public int add(int x, int y) {
//        int sum = x + y;
//        return sum;
//    }

    // default
    public BankAccount() {
        System.out.println("Came to default constructor");
        numberOfAccounts = numberOfAccounts + 1;
        balance = 0;
    }

    //parameter
    public BankAccount(long bal) {
        System.out.println("Came to balance constructor");
        numberOfAccounts++;
        balance = bal;
    }

    //parameter
    public BankAccount(int idOfBankAccount, long bal) {
        System.out.println("Came to id and balance constructor");
        numberOfAccounts++;
        id = idOfBankAccount;
        balance = bal;
    }

    public void withdraw(long amountToWithdraw) {
        balance = balance - amountToWithdraw;
    }

    public void deposit(long amountToDeposit) {
        balance = balance + amountToDeposit;
    }

    public void getCurrentBalance() {
        System.out.println("Current Balance is "+ balance);
    }

}




