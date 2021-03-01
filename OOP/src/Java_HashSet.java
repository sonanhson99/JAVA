import java.util.HashSet;

public class Java_HashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        // Lưu ý: Trong ví dụ trên, mặc dù BMW được thêm hai lần, nó chỉ xuất hiện một lần trong tập hợp 
        // vì mọi mục trong một tập hợp phải là "DUY NHÂT" !!

        // Để kiểm tra xem một mục có tồn tại trong HashSet hay không, hãy sử dụng contains()
        System.out.println(cars.contains("Volvo"));
        System.out.println(cars.contains("honda"));
        // cars.remove("BMw");
        // cars.clear();
        // cars.size();
        for (String i : cars) {
            System.out.println(i);
        }
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
        if(numbers.contains(i)) {
            System.out.println(i + " was found in the set.");
        } else {
            System.out.println(i + " was not found in the set.");
        }
        }
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}
