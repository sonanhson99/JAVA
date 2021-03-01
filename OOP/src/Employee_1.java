class Employee_1 extends Person_1 {
    private int salary;
    public Employee_1(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public void display() {
        System.out.println("Employee name: " + super.getName());
        System.out.println("Employee address: " + super.getAddress());
        System.out.println("Employee salary: " + salary);
    }
}
