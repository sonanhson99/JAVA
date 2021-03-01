class Account {
    private int id;
    private String name;
    private int balance;
    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("That amount exceeds your current balance.");
        }
        else this.balance -= amount;
    }
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}