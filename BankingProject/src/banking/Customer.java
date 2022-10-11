package banking;

/**
 * Represents a customer at the Bank.
 * @author kfsch
 */
public class Customer {
    // Instance vars
    String name; // customer name instance
    String address; // customer address instance

    /**
     * create a constructor for the Customer class,
     * the constructor creates a customer with the given name.
     * @param name
     */
    public Customer(String name) {
        // this sets instance vars name as the given name
        this.name = name;
    }

    /** method setAddress for Customer
     * sets the address of a customer with the given address as the only arg
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * return customers name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * returns address of a customer
     * @return
     */
    public String getAddress() {
        return this.address;
    }



}
