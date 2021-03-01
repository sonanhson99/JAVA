public class Constructor {
    public static void main(String[] args) {
        // Student0 s = new Student0();
        // Student1 a = new Student1("Sơn");
        Student2 s1 = new Student2("Sơn", 20);
		s1.show();
    }
}
class Student0 {
    // Constructor không tham số
    public Student0() {
        System.out.println("Constructor called");
    }
}
class Student1 {
    // Constructor(phương thức khởi tạo) có tham số
    public Student1(String nameString) {
        System.out.println("My name is " + nameString);
    }
}
class Student2 {
	String name;
	int age;

	public Student2(String n, int a) {
		name = n;
		age = a;
	}
    // Lưu ý: nếu tên tham số đầu vào trùng với tên thuộc tính của lớp thì bạn có thể truy xuất 
    // tới thuộc tính của lớp bằng từ khóa this và toán tử . giống như ví dụ sau:
    
    // public Student2(String name, int age) {
	// 	this.name = name;
	// 	this.age = age;
	// }

	public void show() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
