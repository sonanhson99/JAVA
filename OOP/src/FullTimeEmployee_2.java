public class FullTimeEmployee_2 extends Employee_2 {
    public FullTimeEmployee_2(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public int calculateSalary() {
        return 8*getPaymentPerHour();
    }
}

