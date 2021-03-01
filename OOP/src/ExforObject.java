class ExforObject {
    private String name;
    private String address;
    private int id;
    public ExforObject(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", ID: " + id;
    }
    @Override
    public boolean equals(Object obj) {
        return this.id == ((ExforObject) obj).id;
    }
}
