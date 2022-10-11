package banking;
import java.util.Scanner;

/**
 * Represent a bank for managing customers and their accounts.
 * @author kfsch
 */
public class Bank {

    public static void main(String[] args) {
        // create a new instance of the Bank class in main
        Bank bank = new Bank();

        bank.run(); // call the method 'run()' in the new Bank class

    }

    /**
     * Runs the program by initializing and managing customers and their accounts.
     */
    public void run() {
        //get customer name
        System.out.println("Welcome to the Bank. What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name + ", we are creating Checking and Savings account for you.");

        // calling Constructor for Customer class to create accounts
        Customer customer = new Customer(name);

        // get customer address
        System.out.println("What is your address?");
        String address = scanner.next();
        // sets customer address
        customer.setAddress(address);

        // generate a Checking and Savings account for customer
        BankAccount checkingAccount = new BankAccount("checking", customer);
        BankAccount savingsAccount = new BankAccount("savings", customer);

        // gets and prints customer information associated with checking account
        System.out.println("");
        System.out.println("Customer Information: ");
        System.out.println(checkingAccount.getCustomerInfo());

        // gets and prints acc info for checking account
        System.out.println("");
        System.out.println("Checking Account: ");
        System.out.println(checkingAccount.getAccountInfo());
        // gets and prints acc info for savings account
        System.out.println("Savings Account: ");
        System.out.println(savingsAccount.getAccountInfo());

        //deposits
        //info checking and get amount for deposit in checking account
        System.out.println("");
        System.out.println("Amount (decimal) to deposit into your checking account?");
        double amount = scanner.nextDouble();
        checkingAccount.deposit(amount);
        //info checking and get amount for deposit in savings account
        System.out.println("");
        System.out.println("Amount (decimal) to deposit into your savings account?");
        amount = scanner.nextDouble();
        savingsAccount.deposit(amount);
        //prints new balance
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());

        //Withdraws
        System.out.println("");
        System.out.println("Amount (decimal) to withdraw into your checking account?");
        amount = scanner.nextDouble();
        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("Amount (decimal) to withdraw into your savings account?");
        amount = scanner.nextDouble();
        try {
            savingsAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //prints new balance
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());

        scanner.close();
    }

}
