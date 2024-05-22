public class BankAccountDemo {
    public static void main(String[] args) {

        System.out.println("Number of account at the start of the day");
        System.out.println(BankAccount.numberOfAccounts);

        BankAccount arjunAccount = new BankAccount();
        arjunAccount.id = 1;
        arjunAccount.name = "Arjun";

        System.out.println("Printing balance before any operation");
        arjunAccount.getCurrentBalance(); // 0

        System.out.println("Deposit 100 dollars to account");
        arjunAccount.deposit(100);

        arjunAccount.getCurrentBalance();  // 100

        System.out.println("Withdraw 200 dollars to account");
        arjunAccount.withdraw(200);


        arjunAccount.getCurrentBalance(); // -100

        BankAccount secondAccount = new BankAccount();
        secondAccount.id = 2;
        secondAccount.name = " Secondary Account";

        System.out.println("Second Account's Balance");
        secondAccount.getCurrentBalance();


        System.out.println("Third Account's Balance");
        BankAccount thirdAccount = new BankAccount();
        thirdAccount.getCurrentBalance();
        thirdAccount.id = 3;
        thirdAccount.name ="Third Account";

        System.out.println("Operations on Third Account");

        thirdAccount.deposit(500);
        thirdAccount.withdraw(100);

        thirdAccount.getCurrentBalance();

        System.out.println("First account's details");
        arjunAccount.getCurrentBalance();

        System.out.println("Constructors Demo");
        // Default constructor
        BankAccount zeroBalanceAccount = new BankAccount();// 4th account
        zeroBalanceAccount.getCurrentBalance();
        System.out.println("zeroBalanceAccount Id: " + zeroBalanceAccount.id);

        // Parameterized constructor
        BankAccount accountWithBalance = new BankAccount(5, 500);
        System.out.println("accountWithBalance Id: " + accountWithBalance.id);
        accountWithBalance.getCurrentBalance();

        System.out.println("Number of accounts present in bank");
        System.out.println(BankAccount.numberOfAccounts);

        BankAccount anotherAccount = new BankAccount();
        BankAccount finalAccount = new BankAccount();
        finalAccount.id = 456;
        finalAccount.name = "something";

        System.out.println("Total number of accounts created");
        System.out.println(BankAccount.numberOfAccounts);


        System.out.println("asdf");
        System.out.println(23);
        System.out.println(false);
        System.out.println(3.14f);
        System.out.println('c');


        BankAccountDemo demo = new BankAccountDemo();
        demo.add(10, 20);

        demo.add(3.14f, 4.14f);

        demo.add("Hello", "Welcome!");

        demo.add(true, false);



    }

    private void add(boolean x, boolean y) {
        System.out.println(x && y);

    }

    // Concatenation
    private void add(String x, String y) {
        System.out.println(x + " " + y);

    }

    private void add(float x, float y) {
        //Adding two numbers and printing the sum
        System.out.println("Sum is " + (x + y));
    }

    public void add(int x, int y) {
        //Adding two numbers and printing the sum
        System.out.println("Sum is " + (x + y));
    }



}
