public class Invoice {
    private Customer customer;
    private double amount;
    public Invoice(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public double getAmountAfterDiscount() {
        return amount - amount*customer.getDiscount()/100;
    }
}
