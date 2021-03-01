import java.util.ArrayList;
import java.util.Collections;

public class Java_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("vinmast");
        cars.add("BMW");
        cars.add("honda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(1, "son");
        System.out.println(cars.get(1));
        // xóa 1 phần tử
        // cars.remove(1);
        // xóa toàn bộ
        // cars.clear();
        // kích thước
        // cars.size();
        // sắp xếp 
        Collections.sort(cars);
    }
}
// Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of 
// type "String". Remember that a String in Java is an object (not a primitive type). To use other types, 
// such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean 
// for boolean, Character for char, Double for double, etc: