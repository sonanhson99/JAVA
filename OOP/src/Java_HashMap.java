import java.util.HashMap;

public class Java_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> thuDo = new HashMap<String, String>();
        thuDo.put("vietnam", "hanoi");
        thuDo.put("england", "london");
        thuDo.put("Germany", "Berlin");
        thuDo.put("Norway", "Oslo");
        thuDo.put("USA", "Washington DC");
        System.out.println(thuDo);
        System.out.println(thuDo.get("vietnam"));
        thuDo.remove("england");
        System.out.println(thuDo);
        // duyệt phần tử dùng keyset() cho key, values() cho value
        for (String i : thuDo.keySet()) {
            System.out.println(i);
        }
        for (String i : thuDo.values()) {
            System.out.println(i);
        }
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
        System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
