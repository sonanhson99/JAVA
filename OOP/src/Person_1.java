// Person_1 là lớp trừ tượng dùng để lưu thông tin chung về đối tượng con người.
public abstract class Person_1 {
    private String name;
    private String address;
    public Person_1(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Lớp trừu tượng có thể có các phương thức trừu tượng. 
    // Phương thức trừu tượng là phương thức mà chỉ có phần khai báo, không có phần thân.
    public abstract void display();
}