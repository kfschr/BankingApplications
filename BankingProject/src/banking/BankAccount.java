package banking;

/**
 * Represents a checking/savings account for a customer.
 * @author kfsch
 */
public class BankAccount {
    //define 3 instance variables for the BankAccount Class
    /**
     * INSTANCE 1 - Types of account (checking/savings)
     */
    String accountType;
    /**
     * INSTANCE 2 - Balance of an account
     */
    double balance;
    /**
     * INSTANCE 3 - Customer for this account
     */
    Customer customer;

    /** CONSTRUCTOR
     * Create a constructor for the BankAccount Class.
     * @param accountType for bank account
     * @param customer for bank account
     */
    public BankAccount(String accountType, Customer customer) {
        this.accountType = accountType;
        this.customer = customer;
    }

    // methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * withdraws the given amount from balance, with exception
     * if requested amount over balance amount.
     * @param amount
     * @throws Exception
     */
    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("Amount is greater than the available balance.");
        }
        this.balance -= amount;
    }

    /**
     * returns account type and balance amount for a given account.
     * @return string containing account type and balance amount.
     */
    public String getAccountInfo() {
        return this.accountType + ": " + this.balance;
    }

    /**
     * returns customer's name and address for a given customer name.
     * @return string containing name + address
     */
    public String getCustomerInfo() {
        return this.customer.getName() + " from " + this.customer.getAddress();

    }


}
