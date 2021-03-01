public class PartTimeEmployee_2 extends Employee_2 {
    private int workingHours;
    public PartTimeEmployee_2(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    @Override
    public int calculateSalary() {
        return workingHours*getPaymentPerHour();
    }
}
